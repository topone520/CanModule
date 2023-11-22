package com.android.canlibrary.observer;

import android.util.Log;

import com.android.canlibrary.Constant;
import com.android.canlibrary.bean.Can1DataBean;
import com.android.canlibrary.interfaces.CanInterface;
import com.android.canlibrary.utils.DataUtils;
import com.android.canlibrary.utils.Logger;

/**
 * 监听Can1数据变化工具类
 * FileName: Can1ChangeObserver
 * Author: ccm
 * Date: 2023/10/18
 *
 */
public class Can1ChangeObserver implements Runnable {

    private boolean isRunning;
    private CanInterface canInterface;
    private CanChangeListener mCanChangeListener;

    // 故障码
    private int fault1 = 0;
    private int fault2 = 0;

    public Can1ChangeObserver() {
        isRunning = false;
        canInterface = new CanInterface();
        startListening();
    }

    public CanChangeListener getCanChangeListener() {
        return mCanChangeListener;
    }

    public void setCanChangeListener(CanChangeListener canChangeListener) {
        mCanChangeListener = canChangeListener;
    }

    public interface CanChangeListener {
        /**
         * 监听can1变化
         */
        void onCan1Changed(Can1DataBean can1DataBean);
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
            byte[] receivedCan1Data = canInterface.receiveCan1Message();
            if (receivedCan1Data != null){
                Logger.d("run: receivedCan1Data：" + receivedCan1Data.length);
                // 拆分16字节数据为两个8字节数据
                // 帧字节
                byte[] partCan1Id = new byte[8];
                // 报文字节
                byte[] partCan1Data = new byte[8];
                System.arraycopy(receivedCan1Data, 0, partCan1Id, 0, 8);
                System.arraycopy(receivedCan1Data, 8, partCan1Data, 0, 8);
                String part1 = DataUtils.ByteArrToHex(partCan1Id);
                String part2 = DataUtils.ByteArrToHex(partCan1Data);
                Logger.d("run: 接收到了数据 part1：" + part1+" , part2: "+part2);
                mCanChangeListener.onCan1Changed(onCan1DataChange(part1, part2));
            }
        }
    }

    public Can1DataBean onCan1DataChange(String part1, String part2){
        Can1DataBean can1DataBean = new Can1DataBean();

        String str1 = "0x";
        int x = 8;
        String substring1 = part1.substring(0, 2);
        String substring2 = part1.substring(3, 5);
        String substring3 = part1.substring(6, 8);
        String substring4 = String.valueOf(Integer.parseInt(part1.substring(9, 10)) - x) + part1.substring(10, 11);

        String can1Id = str1 + substring4 + substring3 + substring2 + substring1;
        String str2 = can1Id + " " + part2;
        String[] split1 = str2.split(" ");
        Logger.d( "split1: " + split1[0] + " , " + split1[1] + " , " + split1[2] + " , " + split1[3] + " , " + split1[4] + " , " + split1[5] + " , " + split1[6] + " , " + split1[7] + " , " + split1[8]);

        String can1Sp1 = split1[1];
        String can1Sp2 = split1[2];
        String can1Sp3 = split1[3];
        String can1Sp4 = split1[4];
        String can1Sp5 = split1[5];
        String can1Sp6 = split1[6];
        String can1Sp7 = split1[7];
        String can1Sp8 = split1[8];

        if (split1[0].equals(Constant.SPEED_OF_VEHICLE_ID)) {
            Log.d("ccm------>","speedVehicle"+DataUtils.HexTo10Int(can1Sp7 + can1Sp8));
            Logger.d( "setReactantAllowance1111111: "+ DataUtils.HexTo10Int(can1Sp7 + can1Sp8));
            can1DataBean.setSpeedOfVehicle(DataUtils.HexTo10Int(can1Sp7 + can1Sp8));
        } else if (split1[0].equals(Constant.ROTATIONAL_SPEED_ID)) {
            can1DataBean.setRotationalSpeed((int) (DataUtils.HexTo10Int(can1Sp5 + can1Sp4) * 0.125));
        } else if (split1[0].equals(Constant.REACTANT_ALLOWANCE_ID)) {
            can1DataBean.setReactantAllowance((int) (DataUtils.HexTo10Int(can1Sp1) * 0.4 ));
            Logger.d( "setReactantAllowance: "+ (int) (DataUtils.HexTo10Int(can1Sp1) * 0.4 ));
        }else if(split1[0].equals(Constant.SINGLE_FAULT_CODE_ID)){
            can1DataBean.setDpfWarningLight(DataUtils.HexTo10Int(can1Sp1));
            fault1 = DataUtils.HexTo10Int(can1Sp3);
        } else if (split1[0].equals(Constant.ALARM_LIGHT_ID)) {
            //0 1 2 3 4 5 6 7
            //7 6 5 4 3 2 1 0
            can1DataBean.setDpfProhibition(DataUtils.HexTo10Int(can1Sp3));

            String s1 = DataUtils.HexTo2String(can1Sp1);
            String s2 = DataUtils.HexTo2String(can1Sp2);
            while (s1.length() < 8) {
                s1 = "0" + s1;
            }
            can1DataBean.setDriverWarningLight(Integer.parseInt(s1.substring(5,8)));

            while (s2.length() < 8) {
                s2 = "0" + s2;
            }
            can1DataBean.setRegenerativeReminder(Integer.parseInt(s2.substring(4,6)));

            can1DataBean.setExcessiveExhaustTemperature(DataUtils.HexTo10Int(can1Sp7));
        } else if (split1[0].equals(Constant.WATER_TEMPERATURE_ID)) {
            can1DataBean.setWaterTemperature(DataUtils.HexTo10Int(can1Sp1) - 40);
        } else if (split1[0].equals(Constant.OIL_PRESSURE_ID)) {
            can1DataBean.setOilPressure(DataUtils.HexTo10Int(can1Sp4) * 4);
        } else if (split1[0].equals(Constant.WATER_IN_OIL_ID)) {
            can1DataBean.setWaterInOil(DataUtils.HexTo10Int(can1Sp1));
        } else if (split1[0].equals(Constant.ENGINE_WARM_UP_LIGHT_ID)) {
            String s5 = DataUtils.HexTo2String(can1Sp5);
            // 解析第一个字节
            while (s5.length() < 8) {
                s5 = "0" + s5;
            }
            can1DataBean.setEngineWarmUpLight(Integer.parseInt(s5.substring(1, 2)));
        } else if (split1[0].equals(Constant.ENGINE_INPUT_VOLTAGE_ID)) {
            can1DataBean.setEngineInputVoltage((float) (DataUtils.HexTo10Int(can1Sp6 + can1Sp5) * 0.05));
        } else if (split1[0].equals(Constant.INFORMATION_CIRCULAR_ID)) {
            fault2 = DataUtils.HexTo10Int(can1Sp2);
        }
        Logger.d( "fault1: " + fault1+" ，fault2: " + fault2);
        if (fault1 == 0 && fault2 == 0) {
            can1DataBean.setFaultCode(0);
        } else {
            can1DataBean.setFaultCode(1);
        }
        return can1DataBean;
    }



}
