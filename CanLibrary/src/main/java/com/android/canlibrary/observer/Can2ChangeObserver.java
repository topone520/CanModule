package com.android.canlibrary.observer;

import com.android.canlibrary.Constant;
import com.android.canlibrary.bean.Can2DataBean;
import com.android.canlibrary.interfaces.CanInterface;
import com.android.canlibrary.utils.DataUtils;
import com.android.canlibrary.utils.Logger;

/**
 * 监听Can2数据变化工具类
 * FileName: Can2ChangeObserver
 * Author: ccm
 * Date: 2023/10/18
 *
 */
public class Can2ChangeObserver implements Runnable{

    private boolean isRunning;
    private CanInterface canInterface;
    private CanChangeListener mCanChangeListener;
    private Can2DataBean can2DataBean;

    public Can2ChangeObserver() {
        isRunning = false;
        canInterface = new CanInterface();
        startListening();
        can2DataBean = new Can2DataBean();
    }

    public CanChangeListener getCanChangeListener() {
        return mCanChangeListener;
    }

    public void setCanChangeListener(CanChangeListener canChangeListener) {
        mCanChangeListener = canChangeListener;
    }

    public interface CanChangeListener {
        /**
         * 监听can2变化
         */
        void onCan2Changed(Can2DataBean can2DataBean);
    }


    public void startListening() {
        if (!isRunning) {
            isRunning = true;
            Thread thread = new Thread(this);
            thread.start();
        }
    }

    public void stopListening() {
        isRunning = false;
    }

    @Override
    public void run() {
        while (isRunning) {
            byte[] receivedCan2Data = canInterface.receiveCan2Message();
            if (receivedCan2Data != null){
                Logger.d("run: receivedCan2Data：" + receivedCan2Data.length);
                // 拆分16字节数据为两个8字节数据
                // 帧字节
                byte[] partCan1Id = new byte[8];
                // 报文字节
                byte[] partCan1Data = new byte[8];
                System.arraycopy(receivedCan2Data, 0, partCan1Id, 0, 8);
                System.arraycopy(receivedCan2Data, 8, partCan1Data, 0, 8);
                String part1 = DataUtils.ByteArrToHex(partCan1Id);
                String part2 = DataUtils.ByteArrToHex(partCan1Data);
                Logger.d("run: 接收到了数据 part1：" + part1+" , part2: "+part2);
                mCanChangeListener.onCan2Changed(onCan2DataChange(part1, part2));
            }
        }
    }


    public Can2DataBean onCan2DataChange(String part1, String part2) {
        String str1 = "0x";
        String substring1 = part1.substring(0, 2);
        String substring2 = part1.substring(3, 5);
        String can2Id = str1 + substring2 + substring1;
        String str2 = can2Id + " " + part2;
        String[] split2 = str2.split(" ");
        Logger.d("split2: " + split2[0] + " , " + split2[1] + " , " + split2[2] + " , " + split2[3] + " , " + split2[4] + " , " + split2[5] + " , " + split2[6] + " , " + split2[7] + " , " + split2[8]);

        String can2Sp1 = split2[1];
        String can2Sp2 = split2[2];
        String can2Sp3 = split2[3];
        String can2Sp4 = split2[4];
        String can2Sp5 = split2[5];
        String can2Sp6 = split2[6];
        String can2Sp7 = split2[7];
        String can2Sp8 = split2[8];

        if (split2[0].equals(Constant.REALTIME_STATUS_ID)) {
            String s1 = DataUtils.HexTo2String(can2Sp1);
            String s2 = DataUtils.HexTo2String(can2Sp2);
            int s3 = DataUtils.HexTo10Int(can2Sp3);
            int s4 = DataUtils.HexTo10Int(can2Sp4);
            int s5 = DataUtils.HexTo10Int(can2Sp5);
            int s6 = DataUtils.HexTo10Int(can2Sp6);
            String s7 = DataUtils.HexTo2String(can2Sp7);
            String s8 = DataUtils.HexTo2String(can2Sp8);

            // 解析第一个字节
            while (s1.length() < 8) {
                s1 = "0" + s1;
            }
            can2DataBean.setTurnLeftLightSignal(Integer.parseInt(s1.substring(7, 8)));
            can2DataBean.setRightTurnLightSignal(Integer.parseInt(s1.substring(6, 7)));
            can2DataBean.setHighBeamSignal(Integer.parseInt(s1.substring(5, 6)));
            can2DataBean.setNearLightSignal(Integer.parseInt(s1.substring(4, 5)));
            can2DataBean.setSignalOfProfileLight(Integer.parseInt(s1.substring(3, 4)));
            can2DataBean.setRearFogLamp(Integer.parseInt(s1.substring(2, 3)));
            can2DataBean.setMainDrivingSeatBelt(Integer.parseInt(s1.substring(1, 2)));
            can2DataBean.setPassengerSeatBelt(Integer.parseInt(s1.substring(0, 1)));

            // 解析第二个字节
            while (s2.length() < 8) {
                s2 = "0" + s2;
            }
            can2DataBean.setPositionLight(Integer.parseInt(s2.substring(7, 8)));
            can2DataBean.setParkingSignal(Integer.parseInt(s2.substring(6, 7)));
            can2DataBean.setPowerGenerationSignal(Integer.parseInt(s2.substring(5, 6)));
            can2DataBean.setReverseSignal(Integer.parseInt(s2.substring(4, 5)));
            // can2DataBean.setFuelLevel(DataUtils.HexTo10Int(s2.substring(1, 4)));00

            can2DataBean.setFuelLevel(DataUtils.BinTo10Int(s2.substring(0, 3)));

            // 解析第三个字节
            can2DataBean.setHydraulicOilTemperature(s3);
            // 解析第四个字节
            can2DataBean.setGasTankPressure(s4);
            // 解析第五个字节
            can2DataBean.setCuttingTableAngleSensor(s5);
            // 解析第六个字节
            can2DataBean.setUnloadingCylinderAngleSensor(s6);
            // 解析第七个字节
            while (s7.length() < 4) {
                s7 = "0" + s7;
            }
            can2DataBean.setModeOfWork(Integer.parseInt(s7.substring(3, 4)));
            can2DataBean.setAutopilotStatus(Integer.parseInt(s7.substring(1, 3)));

        } else if (split2[0].equals(Constant.WORKING_CONDITION_ID)) {
            // 解析第一，二个字节
            can2DataBean.setRotationSpeedOfTheWheel(DataUtils.HexTo10Int(can2Sp1 + can2Sp2));
            // 解析第三，四个字节
            can2DataBean.setAxialFlowDrumSpeed(DataUtils.HexTo10Int(can2Sp3 + can2Sp4));
            // 解析第五，六个字节
            can2DataBean.setGrainAugerRotationSpeed(DataUtils.HexTo10Int(can2Sp5 + can2Sp6));
            // 解析第七，八个字节
            can2DataBean.setSpeedOfFan(DataUtils.HexTo10Int(can2Sp7 + can2Sp8));
        } else if (split2[0].equals(Constant.INPUT_DIAGNOSIS_ID)) {
            String s1 = DataUtils.HexTo2String(can2Sp1);
            String s2 = DataUtils.HexTo2String(can2Sp2);
            String s3 = DataUtils.HexTo2String(can2Sp3);
            String s4 = DataUtils.HexTo2String(can2Sp4);
            String s5 = DataUtils.HexTo2String(can2Sp5);
            String s6 = DataUtils.HexTo2String(can2Sp6);
            String s7 = DataUtils.HexTo2String(can2Sp7);
            String s8 = DataUtils.HexTo2String(can2Sp8);

            // 解析第一个字节
            while (s1.length() < 8) {
                s1 = "0" + s1;
            }
            can2DataBean.setPowerOut1(Integer.parseInt(s1.substring(6, 8)));
            can2DataBean.setPowerOut2(Integer.parseInt(s1.substring(4, 6)));
            can2DataBean.setPowerOut3(Integer.parseInt(s1.substring(2, 4)));
            can2DataBean.setPowerOut4(Integer.parseInt(s1.substring(0, 2)));

            // 解析第二个字节
            while (s2.length() < 8) {
                s2 = "0" + s2;
            }
            can2DataBean.setPowerOut5(Integer.parseInt(s2.substring(6, 8)));
            can2DataBean.setPowerOut6(Integer.parseInt(s2.substring(4, 6)));
            can2DataBean.setPowerOut7(Integer.parseInt(s2.substring(2, 4)));
            can2DataBean.setPowerOut8(Integer.parseInt(s2.substring(0, 2)));

            // 解析第三个字节
            while (s3.length() < 8) {
                s3 = "0" + s3;
            }
            can2DataBean.setPowerOut9(Integer.parseInt(s3.substring(6, 8)));
            can2DataBean.setPowerOut10(Integer.parseInt(s3.substring(4, 6)));
            can2DataBean.setPowerOut11(Integer.parseInt(s3.substring(2, 4)));
            can2DataBean.setPowerOut12(Integer.parseInt(s3.substring(0, 2)));

            // 解析第四个字节
            while (s4.length() < 8) {
                s4 = "0" + s4;
            }
            can2DataBean.setPowerOut13(Integer.parseInt(s4.substring(6, 8)));
            can2DataBean.setPowerOut14(Integer.parseInt(s4.substring(4, 6)));
            can2DataBean.setPowerOut15(Integer.parseInt(s4.substring(2, 4)));
            can2DataBean.setPowerOut16(Integer.parseInt(s4.substring(0, 2)));

            // 解析第五个字节
            while (s5.length() < 8) {
                s5 = "0" + s5;
            }
            can2DataBean.setPowerOut17(Integer.parseInt(s5.substring(6, 8)));
            can2DataBean.setPowerOut18(Integer.parseInt(s5.substring(4, 6)));
            can2DataBean.setPowerOut19(Integer.parseInt(s5.substring(2, 4)));
            can2DataBean.setPowerOut20(Integer.parseInt(s5.substring(0, 2)));

            // 解析第六个字节
            while (s6.length() < 8) {
                s6 = "0" + s6;
            }
            can2DataBean.setPowerOut21(Integer.parseInt(s6.substring(6, 8)));
            can2DataBean.setPowerOut22(Integer.parseInt(s6.substring(4, 6)));
            can2DataBean.setPowerOut23(Integer.parseInt(s6.substring(2, 4)));
            can2DataBean.setPowerOut24(Integer.parseInt(s6.substring(0, 2)));

            // 解析第七个字节
            while (s7.length() < 8) {
                s7 = "0" + s7;
            }
            can2DataBean.setProportionalValveOutput1(Integer.parseInt(s7.substring(6, 8)));
            can2DataBean.setProportionalValveOutput2(Integer.parseInt(s7.substring(4, 6)));
            can2DataBean.setProportionalValveOutput3(Integer.parseInt(s7.substring(2, 4)));
            can2DataBean.setProportionalValveOutput4(Integer.parseInt(s7.substring(0, 2)));

            // 解析第八个字节
            while (s8.length() < 8) {
                s8 = "0" + s8;
            }
            can2DataBean.setNegativeOut1(Integer.parseInt(s8.substring(7, 8)));
            can2DataBean.setNegativeOut2(Integer.parseInt(s8.substring(6, 7)));
            can2DataBean.setNegativeOut3(Integer.parseInt(s8.substring(5, 6)));
            can2DataBean.setNegativeOut4(Integer.parseInt(s8.substring(4, 5)));
            can2DataBean.setPushRod2HOutput(Integer.parseInt(s8.substring(3, 4)));
            can2DataBean.setPushRod2LOutput(Integer.parseInt(s8.substring(2, 3)));
            can2DataBean.setPushRod4HOutput(Integer.parseInt(s8.substring(1, 2)));
            can2DataBean.setPushRod4LOutput(Integer.parseInt(s8.substring(0, 1)));
        } else if (split2[0].equals(Constant.INPUT_DIAGNOSIS_ID)) {
            String s1 = DataUtils.HexTo2String(can2Sp1);
            String s2 = DataUtils.HexTo2String(can2Sp2);
            String s3 = DataUtils.HexTo2String(can2Sp3);
            String s4 = DataUtils.HexTo2String(can2Sp4);
            String s5 = DataUtils.HexTo2String(can2Sp5);
            String s6 = DataUtils.HexTo2String(can2Sp6);
            String s7 = DataUtils.HexTo2String(can2Sp7);
            String s8 = DataUtils.HexTo2String(can2Sp8);

            // 解析第一个字节
            while (s1.length() < 8) {
                s1 = "0" + s1;
            }

            can2DataBean.setNegativeControlSignalInput1(Integer.parseInt(s1.substring(6, 8)));
            can2DataBean.setNegativeControlSignalInput2(Integer.parseInt(s1.substring(4, 6)));
            can2DataBean.setNegativeControlSignalInput3(Integer.parseInt(s1.substring(2, 4)));
            can2DataBean.setNegativeControlSignalInput4(Integer.parseInt(s1.substring(0, 2)));

            // 解析第二个字节
            while (s2.length() < 8) {
                s2 = "0" + s2;
            }
            can2DataBean.setNegativeControlSignalInput5(Integer.parseInt(s2.substring(6, 8)));
            can2DataBean.setNegativeControlSignalInput6(Integer.parseInt(s2.substring(4, 6)));
            can2DataBean.setNegativeControlSignalInput7(Integer.parseInt(s2.substring(2, 4)));
            can2DataBean.setNegativeControlSignalInput8(Integer.parseInt(s2.substring(0, 2)));

            // 解析第三个字节
            while (s3.length() < 8) {
                s3 = "0" + s3;
            }
            can2DataBean.setNegativeControlSignalInput9(Integer.parseInt(s3.substring(6, 8)));
            can2DataBean.setNegativeControlSignalInput10(Integer.parseInt(s3.substring(4, 6)));
            can2DataBean.setNegativeControlSignalInput11(Integer.parseInt(s3.substring(2, 4)));
            can2DataBean.setNegativeControlSignalInput12(Integer.parseInt(s3.substring(0, 2)));

            // 解析第四个字节
            while (s4.length() < 8) {
                s4 = "0" + s4;
            }
            can2DataBean.setNegativeControlSignalInput13(Integer.parseInt(s4.substring(6, 8)));
            can2DataBean.setNegativeControlSignalInput14(Integer.parseInt(s4.substring(4, 6)));
            can2DataBean.setNegativeControlSignalInput15(Integer.parseInt(s4.substring(2, 4)));
            can2DataBean.setNegativeControlSignalInput16(Integer.parseInt(s4.substring(0, 2)));

            // 解析第五个字节
            while (s5.length() < 8) {
                s5 = "0" + s5;
            }
            can2DataBean.setNegativeControlSignalInput17(Integer.parseInt(s5.substring(6, 8)));
            can2DataBean.setNegativeControlSignalInput18(Integer.parseInt(s5.substring(4, 6)));
            can2DataBean.setNegativeControlSignalInput19(Integer.parseInt(s5.substring(2, 4)));
            can2DataBean.setNegativeControlSignalInput20(Integer.parseInt(s5.substring(0, 2)));

            // 解析第六个字节
            while (s6.length() < 8) {
                s6 = "0" + s6;
            }
            can2DataBean.setNegativeControlSignalInput21(Integer.parseInt(s6.substring(6, 8)));
            can2DataBean.setNegativeControlSignalInput22(Integer.parseInt(s6.substring(4, 6)));
            can2DataBean.setNegativeControlSignalInput23(Integer.parseInt(s6.substring(2, 4)));
            can2DataBean.setNegativeControlSignalInput24(Integer.parseInt(s6.substring(0, 2)));

            // 解析第七个字节
            while (s7.length() < 8) {
                s7 = "0" + s7;
            }
            can2DataBean.setNegativeControlSignalInput25(Integer.parseInt(s7.substring(6, 8)));
            can2DataBean.setNegativeControlSignalInput26(Integer.parseInt(s7.substring(4, 6)));
            can2DataBean.setNegativeControlSignalInput27(Integer.parseInt(s7.substring(2, 4)));
            can2DataBean.setNegativeControlSignalInput28(Integer.parseInt(s7.substring(0, 2)));

            // 解析第八个字节
            while (s8.length() < 8) {
                s8 = "0" + s8;
            }
            can2DataBean.setNegativeControlSignalInput29(Integer.parseInt(s8.substring(6, 8)));
            can2DataBean.setNegativeControlSignalInput30(Integer.parseInt(s8.substring(4, 6)));
            can2DataBean.setNegativeControlSignalInput31(Integer.parseInt(s8.substring(2, 4)));
            can2DataBean.setNegativeControlSignalInput32(Integer.parseInt(s8.substring(0, 2)));
        } else if (split2[0].equals(Constant.BASE_CONTROL_ID)) {
            String s1 = DataUtils.HexTo2String(can2Sp1);
            int s2 = DataUtils.HexTo10Int(can2Sp2);
            int s3 = DataUtils.HexTo10Int(can2Sp3);
            int s4 = DataUtils.HexTo10Int(can2Sp4);
            int s5 = DataUtils.HexTo10Int(can2Sp5);

            // 解析第一个字节
            while (s1.length() < 8) {
                s1 = "0" + s1;
            }
            can2DataBean.setBaseWalkingPushRodPositionSignal(Integer.parseInt(s1.substring(6, 8)));
            can2DataBean.setWalkingSensorFaultInformation(Integer.parseInt(s1.substring(4, 6)));
            can2DataBean.setPositionSignalOfBaseShiftPushRod(Integer.parseInt(s1.substring(2, 4)));
            can2DataBean.setShiftSensorFaultInformation(Integer.parseInt(s1.substring(0, 2)));
            // 解析第二个字节
            can2DataBean.setDegreeOfPushBeforeWalking(s2);
            // 解析第三个字节
            can2DataBean.setDegreeOfPushAfterWalking(s3);
            // 解析第四个字节
            can2DataBean.setDegreeOfPushBeforeShifting(s4);
            // 解析第五个字节
            can2DataBean.setDegreeOfPushAfterShifting(s5);
        }

        return can2DataBean;
    }
}
