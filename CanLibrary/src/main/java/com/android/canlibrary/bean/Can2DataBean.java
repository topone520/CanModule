package com.android.canlibrary.bean;

/**
 * 存储Can2返回的数据
 * FileName: Can2DataBean
 * Author: ccm
 * Date: 2023/10/20
 *
 */
public class Can2DataBean {


    /**
     * 存储基座的数据
     */
    /** 0x0100第一个字节 **/
    // 1~2.基座行走推杆位置信号 00-前进 01-倒车 10-停止 11-未定义
    private int baseWalkingPushRodPositionSignal = -1;
    // 3~4.行走传感器故障信息 00-无故障 01-传感器故障 10-传感器故障 11-同时故障
    private int walkingSensorFaultInformation = -1;
    // 5~6.基座换挡推杆位置信号 00-加档 01-减档 10-空挡 11-未定义
    private int positionSignalOfBaseShiftPushRod = -1;
    // 7~8.换挡传感器故障信息 00-无故障 01-传感器故障 10-传感器故障 11-同时故障
    private int shiftSensorFaultInformation = -1;
    /** 0x0100第二个字节 **/
    // 1~8.行走前推开度
    private int degreeOfPushBeforeWalking = -1;
    /** 0x0100第三个字节 **/
    // 1~8.行走后推开度
    private int degreeOfPushAfterWalking = -1;
    /** 0x0100第四个字节 **/
    // 1~8.换挡前推开度
    private int degreeOfPushBeforeShifting = -1;
    /** 0x0100第五个字节 **/
    // 1~8.换挡后推开度
    private int degreeOfPushAfterShifting = -1;
    /** 0x0100第六个字节 **/
    // 1~8.未定义
    /** 0x0100第七个字节 **/
    // 1~8.未定义
    /** 0x0100第八个字节 **/
    // 1~8.未定义

    public int getBaseWalkingPushRodPositionSignal() {
        return baseWalkingPushRodPositionSignal;
    }

    public void setBaseWalkingPushRodPositionSignal(int baseWalkingPushRodPositionSignal) {
        this.baseWalkingPushRodPositionSignal = baseWalkingPushRodPositionSignal;
    }

    public int getWalkingSensorFaultInformation() {
        return walkingSensorFaultInformation;
    }

    public void setWalkingSensorFaultInformation(int walkingSensorFaultInformation) {
        this.walkingSensorFaultInformation = walkingSensorFaultInformation;
    }

    public int getPositionSignalOfBaseShiftPushRod() {
        return positionSignalOfBaseShiftPushRod;
    }

    public void setPositionSignalOfBaseShiftPushRod(int positionSignalOfBaseShiftPushRod) {
        this.positionSignalOfBaseShiftPushRod = positionSignalOfBaseShiftPushRod;
    }

    public int getShiftSensorFaultInformation() {
        return shiftSensorFaultInformation;
    }

    public void setShiftSensorFaultInformation(int shiftSensorFaultInformation) {
        this.shiftSensorFaultInformation = shiftSensorFaultInformation;
    }

    public int getDegreeOfPushBeforeWalking() {
        return degreeOfPushBeforeWalking;
    }

    public void setDegreeOfPushBeforeWalking(int degreeOfPushBeforeWalking) {
        this.degreeOfPushBeforeWalking = degreeOfPushBeforeWalking;
    }

    public int getDegreeOfPushAfterWalking() {
        return degreeOfPushAfterWalking;
    }

    public void setDegreeOfPushAfterWalking(int degreeOfPushAfterWalking) {
        this.degreeOfPushAfterWalking = degreeOfPushAfterWalking;
    }

    public int getDegreeOfPushBeforeShifting() {
        return degreeOfPushBeforeShifting;
    }

    public void setDegreeOfPushBeforeShifting(int degreeOfPushBeforeShifting) {
        this.degreeOfPushBeforeShifting = degreeOfPushBeforeShifting;
    }

    public int getDegreeOfPushAfterShifting() {
        return degreeOfPushAfterShifting;
    }

    public void setDegreeOfPushAfterShifting(int degreeOfPushAfterShifting) {
        this.degreeOfPushAfterShifting = degreeOfPushAfterShifting;
    }

    /**
     * 输入诊断的数据
     */
    /** 0x0503第一个字节 **/
    // 1~2.负控信号输入1 00-有输入 01-无输入 10-输入故障 11-外部按键短路
    private int negativeControlSignalInput1 = -1;
    // 3~4.负控信号输入2
    private int negativeControlSignalInput2 = -1;
    // 5~6.负控信号输入3
    private int negativeControlSignalInput3 = -1;
    // 7~8.负控信号输入4
    private int negativeControlSignalInput4 = -1;
    /** 0x0503第二个字节 **/
    // 1~2.负控信号输入5
    private int negativeControlSignalInput5 = -1;
    // 3~4.负控信号输入6
    private int negativeControlSignalInput6 = -1;
    // 5~6.负控信号输入7
    private int negativeControlSignalInput7 = -1;
    // 7~8.负控信号输入8
    private int negativeControlSignalInput8 = -1;
    /** 0x0503第三个字节 **/
    // 1~2.负控信号输入9
    private int negativeControlSignalInput9 = -1;
    // 3~4.负控信号输入10
    private int negativeControlSignalInput10 = -1;
    // 5~6.负控信号输入11
    private int negativeControlSignalInput11 = -1;
    // 7~8.负控信号输入12
    private int negativeControlSignalInput12 = -1;
    /** 0x0503第四个字节 **/
    // 1~2.负控信号输入13
    private int negativeControlSignalInput13 = -1;
    // 3~4.负控信号输入14
    private int negativeControlSignalInput14 = -1;
    // 5~6.负控信号输入15
    private int negativeControlSignalInput15 = -1;
    // 7~8.负控信号输入16
    private int negativeControlSignalInput16 = -1;
    /** 0x0503第五个字节 **/
    // 1~2.负控信号输入17
    private int negativeControlSignalInput17 = -1;
    // 3~4.负控信号输入18
    private int negativeControlSignalInput18 = -1;
    // 5~6.负控信号输入19
    private int negativeControlSignalInput19 = -1;
    // 7~8.负控信号输入20
    private int negativeControlSignalInput20 = -1;
    /** 0x0503第六个字节 **/
    // 1~2.负控信号输入21
    private int negativeControlSignalInput21 = -1;
    // 3~4.负控信号输入22
    private int negativeControlSignalInput22 = -1;
    // 5~6.负控信号输入23
    private int negativeControlSignalInput23 = -1;
    // 7~8.负控信号输入24
    private int negativeControlSignalInput24 = -1;
    /** 0x0503第七个字节 **/
    // 1~2.负控信号输入25
    private int negativeControlSignalInput25 = -1;
    // 3~4.负控信号输入26
    private int negativeControlSignalInput26 = -1;
    // 5~6.负控信号输入27
    private int negativeControlSignalInput27 = -1;
    // 7~8.负控信号输入28
    private int negativeControlSignalInput28 = -1;
    /** 0x0503第八个字节 **/
    // 1~2.负控信号输入29
    private int negativeControlSignalInput29 = -1;
    // 3~4.负控信号输入30
    private int negativeControlSignalInput30 = -1;
    // 5~6.负控信号输入31
    private int negativeControlSignalInput31 = -1;
    // 7~8.负控信号输入32
    private int negativeControlSignalInput32 = -1;

    public int getNegativeControlSignalInput1() {
        return negativeControlSignalInput1;
    }

    public void setNegativeControlSignalInput1(int negativeControlSignalInput1) {
        this.negativeControlSignalInput1 = negativeControlSignalInput1;
    }

    public int getNegativeControlSignalInput2() {
        return negativeControlSignalInput2;
    }

    public void setNegativeControlSignalInput2(int negativeControlSignalInput2) {
        this.negativeControlSignalInput2 = negativeControlSignalInput2;
    }

    public int getNegativeControlSignalInput3() {
        return negativeControlSignalInput3;
    }

    public void setNegativeControlSignalInput3(int negativeControlSignalInput3) {
        this.negativeControlSignalInput3 = negativeControlSignalInput3;
    }

    public int getNegativeControlSignalInput4() {
        return negativeControlSignalInput4;
    }

    public void setNegativeControlSignalInput4(int negativeControlSignalInput4) {
        this.negativeControlSignalInput4 = negativeControlSignalInput4;
    }

    public int getNegativeControlSignalInput5() {
        return negativeControlSignalInput5;
    }

    public void setNegativeControlSignalInput5(int negativeControlSignalInput5) {
        this.negativeControlSignalInput5 = negativeControlSignalInput5;
    }

    public int getNegativeControlSignalInput6() {
        return negativeControlSignalInput6;
    }

    public void setNegativeControlSignalInput6(int negativeControlSignalInput6) {
        this.negativeControlSignalInput6 = negativeControlSignalInput6;
    }

    public int getNegativeControlSignalInput7() {
        return negativeControlSignalInput7;
    }

    public void setNegativeControlSignalInput7(int negativeControlSignalInput7) {
        this.negativeControlSignalInput7 = negativeControlSignalInput7;
    }

    public int getNegativeControlSignalInput8() {
        return negativeControlSignalInput8;
    }

    public void setNegativeControlSignalInput8(int negativeControlSignalInput8) {
        this.negativeControlSignalInput8 = negativeControlSignalInput8;
    }

    public int getNegativeControlSignalInput9() {
        return negativeControlSignalInput9;
    }

    public void setNegativeControlSignalInput9(int negativeControlSignalInput9) {
        this.negativeControlSignalInput9 = negativeControlSignalInput9;
    }

    public int getNegativeControlSignalInput10() {
        return negativeControlSignalInput10;
    }

    public void setNegativeControlSignalInput10(int negativeControlSignalInput10) {
        this.negativeControlSignalInput10 = negativeControlSignalInput10;
    }

    public int getNegativeControlSignalInput11() {
        return negativeControlSignalInput11;
    }

    public void setNegativeControlSignalInput11(int negativeControlSignalInput11) {
        this.negativeControlSignalInput11 = negativeControlSignalInput11;
    }

    public int getNegativeControlSignalInput12() {
        return negativeControlSignalInput12;
    }

    public void setNegativeControlSignalInput12(int negativeControlSignalInput12) {
        this.negativeControlSignalInput12 = negativeControlSignalInput12;
    }

    public int getNegativeControlSignalInput13() {
        return negativeControlSignalInput13;
    }

    public void setNegativeControlSignalInput13(int negativeControlSignalInput13) {
        this.negativeControlSignalInput13 = negativeControlSignalInput13;
    }

    public int getNegativeControlSignalInput14() {
        return negativeControlSignalInput14;
    }

    public void setNegativeControlSignalInput14(int negativeControlSignalInput14) {
        this.negativeControlSignalInput14 = negativeControlSignalInput14;
    }

    public int getNegativeControlSignalInput15() {
        return negativeControlSignalInput15;
    }

    public void setNegativeControlSignalInput15(int negativeControlSignalInput15) {
        this.negativeControlSignalInput15 = negativeControlSignalInput15;
    }

    public int getNegativeControlSignalInput16() {
        return negativeControlSignalInput16;
    }

    public void setNegativeControlSignalInput16(int negativeControlSignalInput16) {
        this.negativeControlSignalInput16 = negativeControlSignalInput16;
    }

    public int getNegativeControlSignalInput17() {
        return negativeControlSignalInput17;
    }

    public void setNegativeControlSignalInput17(int negativeControlSignalInput17) {
        this.negativeControlSignalInput17 = negativeControlSignalInput17;
    }

    public int getNegativeControlSignalInput18() {
        return negativeControlSignalInput18;
    }

    public void setNegativeControlSignalInput18(int negativeControlSignalInput18) {
        this.negativeControlSignalInput18 = negativeControlSignalInput18;
    }

    public int getNegativeControlSignalInput19() {
        return negativeControlSignalInput19;
    }

    public void setNegativeControlSignalInput19(int negativeControlSignalInput19) {
        this.negativeControlSignalInput19 = negativeControlSignalInput19;
    }

    public int getNegativeControlSignalInput20() {
        return negativeControlSignalInput20;
    }

    public void setNegativeControlSignalInput20(int negativeControlSignalInput20) {
        this.negativeControlSignalInput20 = negativeControlSignalInput20;
    }

    public int getNegativeControlSignalInput21() {
        return negativeControlSignalInput21;
    }

    public void setNegativeControlSignalInput21(int negativeControlSignalInput21) {
        this.negativeControlSignalInput21 = negativeControlSignalInput21;
    }

    public int getNegativeControlSignalInput22() {
        return negativeControlSignalInput22;
    }

    public void setNegativeControlSignalInput22(int negativeControlSignalInput22) {
        this.negativeControlSignalInput22 = negativeControlSignalInput22;
    }

    public int getNegativeControlSignalInput23() {
        return negativeControlSignalInput23;
    }

    public void setNegativeControlSignalInput23(int negativeControlSignalInput23) {
        this.negativeControlSignalInput23 = negativeControlSignalInput23;
    }

    public int getNegativeControlSignalInput24() {
        return negativeControlSignalInput24;
    }

    public void setNegativeControlSignalInput24(int negativeControlSignalInput24) {
        this.negativeControlSignalInput24 = negativeControlSignalInput24;
    }

    public int getNegativeControlSignalInput25() {
        return negativeControlSignalInput25;
    }

    public void setNegativeControlSignalInput25(int negativeControlSignalInput25) {
        this.negativeControlSignalInput25 = negativeControlSignalInput25;
    }

    public int getNegativeControlSignalInput26() {
        return negativeControlSignalInput26;
    }

    public void setNegativeControlSignalInput26(int negativeControlSignalInput26) {
        this.negativeControlSignalInput26 = negativeControlSignalInput26;
    }

    public int getNegativeControlSignalInput27() {
        return negativeControlSignalInput27;
    }

    public void setNegativeControlSignalInput27(int negativeControlSignalInput27) {
        this.negativeControlSignalInput27 = negativeControlSignalInput27;
    }

    public int getNegativeControlSignalInput28() {
        return negativeControlSignalInput28;
    }

    public void setNegativeControlSignalInput28(int negativeControlSignalInput28) {
        this.negativeControlSignalInput28 = negativeControlSignalInput28;
    }

    public int getNegativeControlSignalInput29() {
        return negativeControlSignalInput29;
    }

    public void setNegativeControlSignalInput29(int negativeControlSignalInput29) {
        this.negativeControlSignalInput29 = negativeControlSignalInput29;
    }

    public int getNegativeControlSignalInput30() {
        return negativeControlSignalInput30;
    }

    public void setNegativeControlSignalInput30(int negativeControlSignalInput30) {
        this.negativeControlSignalInput30 = negativeControlSignalInput30;
    }

    public int getNegativeControlSignalInput31() {
        return negativeControlSignalInput31;
    }

    public void setNegativeControlSignalInput31(int negativeControlSignalInput31) {
        this.negativeControlSignalInput31 = negativeControlSignalInput31;
    }

    public int getNegativeControlSignalInput32() {
        return negativeControlSignalInput32;
    }

    public void setNegativeControlSignalInput32(int negativeControlSignalInput32) {
        this.negativeControlSignalInput32 = negativeControlSignalInput32;
    }


    /**
     * 输出控制
     */
    /** 0x0502第一个字节 **/
    // 1~2.Power_OUT1 00-无输出 01-输出高电平 10-开路故障 11-短路故障
    private int powerOut1 = -1;
    // 3~4.Power_OUT2
    private int powerOut2 = -1;
    // 5~6.Power_OUT3
    private int powerOut3 = -1;
    // 7~8.Power_OUT4
    private int powerOut4 = -1;
    /** 0x0502第二个字节 **/
    // 1~2.Power_OUT5
    private int powerOut5 = -1;
    // 3~4.Power_OUT6
    private int powerOut6 = -1;
    // 5~6.Power_OUT7
    private int powerOut7 = -1;
    // 7~8.Power_OUT8
    private int powerOut8 = -1;
    /** 0x0502第三个字节 **/
    // 1~2.Power_OUT9
    private int powerOut9 = -1;
    // 3~4.Power_OUT10
    private int powerOut10 = -1;
    // 5~6.Power_OUT11
    private int powerOut11 = -1;
    // 7~8.Power_OUT12
    private int powerOut12 = -1;
    /** 0x0502第四个字节 **/
    // 1~2.Power_OUT13
    private int powerOut13 = -1;
    // 3~4.Power_OUT14
    private int powerOut14 = -1;
    // 5~6.Power_OUT15
    private int powerOut15 = -1;
    // 7~8.Power_OUT16
    private int powerOut16 = -1;
    /** 0x0502第五个字节 **/
    // 1~2.Power_OUT17
    private int powerOut17 = -1;
    // 3~4.Power_OUT18
    private int powerOut18 = -1;
    // 5~6.Power_OUT19
    private int powerOut19 = -1;
    // 7~8.Power_OUT20
    private int powerOut20 = -1;
    /** 0x0502第六个字节 **/
    // 1~2.Power_OUT21
    private int powerOut21 = -1;
    // 3~4.Power_OUT22
    private int powerOut22 = -1;
    // 5~6.Power_OUT23
    private int powerOut23 = -1;
    // 7~8.Power_OUT24
    private int powerOut24 = -1;
    /** 0x0502第七个字节 **/
    // 1~2.比例阀输出1
    private int proportionalValveOutput1 = -1;
    // 3~4.比例阀输出2
    private int proportionalValveOutput2 = -1;
    // 5~6.比例阀输出3
    private int proportionalValveOutput3 = -1;
    // 7~8.比例阀输出4
    private int proportionalValveOutput4 = -1;
    /** 0x0502第八个字节 **/
    // 1.NEGATIVE_OUT1
    private int negativeOut1 = -1;
    // 2.NEGATIVE_OUT2
    private int negativeOut2 = -1;
    // 3.NEGATIVE_OUT3
    private int negativeOut3 = -1;
    // 4.NEGATIVE_OUT4
    private int negativeOut4 = -1;
    // 5.推杆2H输出
    private int pushRod2HOutput = -1;
    // 6.推杆2L输出
    private int pushRod2LOutput = -1;
    // 7.推杆4H输出
    private int pushRod4HOutput = -1;
    // 8.推杆4L输出
    private int pushRod4LOutput = -1;

    public int getPowerOut1() {
        return powerOut1;
    }

    public void setPowerOut1(int powerOut1) {
        this.powerOut1 = powerOut1;
    }

    public int getPowerOut2() {
        return powerOut2;
    }

    public void setPowerOut2(int powerOut2) {
        this.powerOut2 = powerOut2;
    }

    public int getPowerOut3() {
        return powerOut3;
    }

    public void setPowerOut3(int powerOut3) {
        this.powerOut3 = powerOut3;
    }

    public int getPowerOut4() {
        return powerOut4;
    }

    public void setPowerOut4(int powerOut4) {
        this.powerOut4 = powerOut4;
    }

    public int getPowerOut5() {
        return powerOut5;
    }

    public void setPowerOut5(int powerOut5) {
        this.powerOut5 = powerOut5;
    }

    public int getPowerOut6() {
        return powerOut6;
    }

    public void setPowerOut6(int powerOut6) {
        this.powerOut6 = powerOut6;
    }

    public int getPowerOut7() {
        return powerOut7;
    }

    public void setPowerOut7(int powerOut7) {
        this.powerOut7 = powerOut7;
    }

    public int getPowerOut8() {
        return powerOut8;
    }

    public void setPowerOut8(int powerOut8) {
        this.powerOut8 = powerOut8;
    }

    public int getPowerOut9() {
        return powerOut9;
    }

    public void setPowerOut9(int powerOut9) {
        this.powerOut9 = powerOut9;
    }

    public int getPowerOut10() {
        return powerOut10;
    }

    public void setPowerOut10(int powerOut10) {
        this.powerOut10 = powerOut10;
    }

    public int getPowerOut11() {
        return powerOut11;
    }

    public void setPowerOut11(int powerOut11) {
        this.powerOut11 = powerOut11;
    }

    public int getPowerOut12() {
        return powerOut12;
    }

    public void setPowerOut12(int powerOut12) {
        this.powerOut12 = powerOut12;
    }

    public int getPowerOut13() {
        return powerOut13;
    }

    public void setPowerOut13(int powerOut13) {
        this.powerOut13 = powerOut13;
    }

    public int getPowerOut14() {
        return powerOut14;
    }

    public void setPowerOut14(int powerOut14) {
        this.powerOut14 = powerOut14;
    }

    public int getPowerOut15() {
        return powerOut15;
    }

    public void setPowerOut15(int powerOut15) {
        this.powerOut15 = powerOut15;
    }

    public int getPowerOut16() {
        return powerOut16;
    }

    public void setPowerOut16(int powerOut16) {
        this.powerOut16 = powerOut16;
    }

    public int getPowerOut17() {
        return powerOut17;
    }

    public void setPowerOut17(int powerOut17) {
        this.powerOut17 = powerOut17;
    }

    public int getPowerOut18() {
        return powerOut18;
    }

    public void setPowerOut18(int powerOut18) {
        this.powerOut18 = powerOut18;
    }

    public int getPowerOut19() {
        return powerOut19;
    }

    public void setPowerOut19(int powerOut19) {
        this.powerOut19 = powerOut19;
    }

    public int getPowerOut20() {
        return powerOut20;
    }

    public void setPowerOut20(int powerOut20) {
        this.powerOut20 = powerOut20;
    }

    public int getPowerOut21() {
        return powerOut21;
    }

    public void setPowerOut21(int powerOut21) {
        this.powerOut21 = powerOut21;
    }

    public int getPowerOut22() {
        return powerOut22;
    }

    public void setPowerOut22(int powerOut22) {
        this.powerOut22 = powerOut22;
    }

    public int getPowerOut23() {
        return powerOut23;
    }

    public void setPowerOut23(int powerOut23) {
        this.powerOut23 = powerOut23;
    }

    public int getPowerOut24() {
        return powerOut24;
    }

    public void setPowerOut24(int powerOut24) {
        this.powerOut24 = powerOut24;
    }

    public int getProportionalValveOutput1() {
        return proportionalValveOutput1;
    }

    public void setProportionalValveOutput1(int proportionalValveOutput1) {
        this.proportionalValveOutput1 = proportionalValveOutput1;
    }

    public int getProportionalValveOutput2() {
        return proportionalValveOutput2;
    }

    public void setProportionalValveOutput2(int proportionalValveOutput2) {
        this.proportionalValveOutput2 = proportionalValveOutput2;
    }

    public int getProportionalValveOutput3() {
        return proportionalValveOutput3;
    }

    public void setProportionalValveOutput3(int proportionalValveOutput3) {
        this.proportionalValveOutput3 = proportionalValveOutput3;
    }

    public int getProportionalValveOutput4() {
        return proportionalValveOutput4;
    }

    public void setProportionalValveOutput4(int proportionalValveOutput4) {
        this.proportionalValveOutput4 = proportionalValveOutput4;
    }

    public int getNegativeOut1() {
        return negativeOut1;
    }

    public void setNegativeOut1(int negativeOut1) {
        this.negativeOut1 = negativeOut1;
    }

    public int getNegativeOut2() {
        return negativeOut2;
    }

    public void setNegativeOut2(int negativeOut2) {
        this.negativeOut2 = negativeOut2;
    }

    public int getNegativeOut3() {
        return negativeOut3;
    }

    public void setNegativeOut3(int negativeOut3) {
        this.negativeOut3 = negativeOut3;
    }

    public int getNegativeOut4() {
        return negativeOut4;
    }

    public void setNegativeOut4(int negativeOut4) {
        this.negativeOut4 = negativeOut4;
    }

    public int getPushRod2HOutput() {
        return pushRod2HOutput;
    }

    public void setPushRod2HOutput(int pushRod2HOutput) {
        this.pushRod2HOutput = pushRod2HOutput;
    }

    public int getPushRod2LOutput() {
        return pushRod2LOutput;
    }

    public void setPushRod2LOutput(int pushRod2LOutput) {
        this.pushRod2LOutput = pushRod2LOutput;
    }

    public int getPushRod4HOutput() {
        return pushRod4HOutput;
    }

    public void setPushRod4HOutput(int pushRod4HOutput) {
        this.pushRod4HOutput = pushRod4HOutput;
    }

    public int getPushRod4LOutput() {
        return pushRod4LOutput;
    }

    public void setPushRod4LOutput(int pushRod4LOutput) {
        this.pushRod4LOutput = pushRod4LOutput;
    }

    // 0-车辆一切正常
    public int getNumber() {
        if (powerOut1 <= 0 && powerOut2 <= 0 && powerOut3 <= 0 && powerOut4 <= 0 && powerOut5 <= 0 && powerOut6 <= 0
                && powerOut7 <= 0 && powerOut8 <= 0 && powerOut9 <= 0 && powerOut10 <= 0 && powerOut11 <= 0 && powerOut12 <= 0
                && powerOut13 <= 0 && powerOut14 <= 0 && powerOut15 <= 0 && powerOut16 <= 0 && powerOut17 <= 0 && powerOut18 <= 0
                && powerOut19 <= 0 && powerOut20 <= 0 && powerOut21 <= 0 && powerOut22 <= 0 && proportionalValveOutput1 <= 0
                && proportionalValveOutput2 <= 0 && proportionalValveOutput3 <= 0
                && proportionalValveOutput4 <= 0 && negativeOut1 <= 0&& negativeOut2 <= 0 && negativeOut3 <= 0
                && negativeOut4 <= 0 && pushRod2HOutput <= 0 && pushRod2LOutput <= 0
                && pushRod4HOutput <= 0 && pushRod4LOutput <= 0 ){
            return 0;
        }else {
            return powerOut1 + powerOut2 + powerOut3 + powerOut4 + powerOut5 + powerOut6 + powerOut7 + powerOut8 + powerOut9
                    + powerOut10 + powerOut11 + powerOut12 + powerOut13 + powerOut14 + powerOut15 + powerOut16 + powerOut17
                    + powerOut18 + powerOut19 + powerOut20 + powerOut21 + powerOut22 + proportionalValveOutput1 + proportionalValveOutput2
                    + proportionalValveOutput3 + proportionalValveOutput4 + negativeOut1 + negativeOut2 + negativeOut3 + negativeOut4
                    + pushRod2HOutput + pushRod2LOutput + pushRod4HOutput + pushRod4LOutput;
        }
    }


    /**
     * 灯光
     */
    /** 0x0500第一个字节 **/
    // 1.左转灯信号
    private int turnLeftLightSignal = -1;
    // 2.右转灯信号
    private int rightTurnLightSignal = -1;
    // 3.远光灯信号
    private int highBeamSignal = -1;
    // 4.近光灯信号
    private int nearLightSignal = -1;
    // 5.示廓灯信号
    private int signalOfProfileLight = -1;
    // 6.后雾灯
    private int rearFogLamp = -1;
    // 7.主驾驶安全带
    private int mainDrivingSeatBelt = -1;
    // 8.副驾驶安全带
    private int passengerSeatBelt = -1;
    /** 0x0500第二个字节 **/
    // 1.刹车油液位过低
    private int positionLight = -1;
    // 2.驻车信号（手刹信号）
    private int parkingSignal = -1;
    // 3.发电信号
    private int powerGenerationSignal = -1;
    // 4.倒车信号
    private int reverseSignal = -1;
    // 5.未定义
//    private int positionLight = -1;
    // 6~8.燃油液位/格
    private int fuelLevel = -1;
    /** 0x0500第三个字节 **/
    // 1~8.液压油温/℃
    private int hydraulicOilTemperature = -1;
    /** 0x0500第四个字节 **/
    // 1~8.气罐压力/Mpa
    private int gasTankPressure = -1;
    /** 0x0500第五个字节 **/
    // 1~8.割台角度传感器 单片机名字：1号角度
    private int cuttingTableAngleSensor = -1;
    /** 0x0500第六个字节 **/
    // 1~8.卸粮筒角度传感器 单片机名字：2号角度
    private int unloadingCylinderAngleSensor = -1;
    /** 0x0500第七个字节 **/
    // 1.工作模式 0-作业模式 1-行走模式
    private int modeOfWork = -1;
    // 2~3.自动驾驶状态 00-处于准备状态（灰） 01-启用状态（蓝色） 10-激活状态（橙黄色） 11-功能故障（红色）
    private int autopilotStatus = -1;
    // 4~8.未定义
    /** 0x0500第八个字节 **/
    // 1～8.未定义

    public int getTurnLeftLightSignal() {
        return turnLeftLightSignal;
    }

    public void setTurnLeftLightSignal(int turnLeftLightSignal) {
        this.turnLeftLightSignal = turnLeftLightSignal;
    }

    public int getRightTurnLightSignal() {
        return rightTurnLightSignal;
    }

    public void setRightTurnLightSignal(int rightTurnLightSignal) {
        this.rightTurnLightSignal = rightTurnLightSignal;
    }

    public int getHighBeamSignal() {
        return highBeamSignal;
    }

    public void setHighBeamSignal(int highBeamSignal) {
        this.highBeamSignal = highBeamSignal;
    }

    public int getNearLightSignal() {
        return nearLightSignal;
    }

    public void setNearLightSignal(int nearLightSignal) {
        this.nearLightSignal = nearLightSignal;
    }

    public int getSignalOfProfileLight() {
        return signalOfProfileLight;
    }

    public void setSignalOfProfileLight(int signalOfProfileLight) {
        this.signalOfProfileLight = signalOfProfileLight;
    }

    public int getRearFogLamp() {
        return rearFogLamp;
    }

    public void setRearFogLamp(int rearFogLamp) {
        this.rearFogLamp = rearFogLamp;
    }

    public int getMainDrivingSeatBelt() {
        return mainDrivingSeatBelt;
    }

    public void setMainDrivingSeatBelt(int mainDrivingSeatBelt) {
        this.mainDrivingSeatBelt = mainDrivingSeatBelt;
    }

    public int getPassengerSeatBelt() {
        return passengerSeatBelt;
    }

    public void setPassengerSeatBelt(int passengerSeatBelt) {
        this.passengerSeatBelt = passengerSeatBelt;
    }

    public int getPositionLight() {
        return positionLight;
    }

    public void setPositionLight(int positionLight) {
        this.positionLight = positionLight;
    }

    public int getParkingSignal() {
        return parkingSignal;
    }

    public void setParkingSignal(int parkingSignal) {
        this.parkingSignal = parkingSignal;
    }

    public int getPowerGenerationSignal() {
        return powerGenerationSignal;
    }

    public void setPowerGenerationSignal(int powerGenerationSignal) {
        this.powerGenerationSignal = powerGenerationSignal;
    }

    public int getReverseSignal() {
        return reverseSignal;
    }

    public void setReverseSignal(int reverseSignal) {
        this.reverseSignal = reverseSignal;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getHydraulicOilTemperature() {
        return hydraulicOilTemperature;
    }

    public void setHydraulicOilTemperature(int hydraulicOilTemperature) {
        this.hydraulicOilTemperature = hydraulicOilTemperature;
    }

    public int getGasTankPressure() {
        return gasTankPressure;
    }

    public void setGasTankPressure(int gasTankPressure) {
        this.gasTankPressure = gasTankPressure;
    }

    public int getCuttingTableAngleSensor() {
        return cuttingTableAngleSensor;
    }

    public void setCuttingTableAngleSensor(int cuttingTableAngleSensor) {
        this.cuttingTableAngleSensor = cuttingTableAngleSensor;
    }

    public int getUnloadingCylinderAngleSensor() {
        return unloadingCylinderAngleSensor;
    }

    public void setUnloadingCylinderAngleSensor(int unloadingCylinderAngleSensor) {
        this.unloadingCylinderAngleSensor = unloadingCylinderAngleSensor;
    }

    public int getModeOfWork() {
        return modeOfWork;
    }

    public void setModeOfWork(int modeOfWork) {
        this.modeOfWork = modeOfWork;
    }

    public int getAutopilotStatus() {
        return autopilotStatus;
    }

    public void setAutopilotStatus(int autopilotStatus) {
        this.autopilotStatus = autopilotStatus;
    }



    /**
     * 工作状态
     */
    /** 0x0501第一，二个字节 **/
    // 1~2.拨禾轮转速/rpm 单片机名字：搅龙转速
    private int rotationSpeedOfTheWheel = -1;
    /** 0x0501第三，四个字节 **/
    // 3~4.轴流滚筒转速/rpm 单片机名字：疏导转速
    private int axialFlowDrumSpeed = -1;
    /** 0x0501第五，六个字节 **/
    // 5~6.籽粒搅龙转速/rpm 单片机名字：后疏导转速
    private int grainAugerRotationSpeed = -1;
    /** 0x0501第七，八个字节 **/
    // 7~8.风机转速/rpm 单片机名字：升运转速
    private int speedOfFan = -1;

    public int getRotationSpeedOfTheWheel() {
        return rotationSpeedOfTheWheel;
    }

    public void setRotationSpeedOfTheWheel(int rotationSpeedOfTheWheel) {
        this.rotationSpeedOfTheWheel = rotationSpeedOfTheWheel;
    }

    public int getAxialFlowDrumSpeed() {
        return axialFlowDrumSpeed;
    }

    public void setAxialFlowDrumSpeed(int axialFlowDrumSpeed) {
        this.axialFlowDrumSpeed = axialFlowDrumSpeed;
    }

    public int getGrainAugerRotationSpeed() {
        return grainAugerRotationSpeed;
    }

    public void setGrainAugerRotationSpeed(int grainAugerRotationSpeed) {
        this.grainAugerRotationSpeed = grainAugerRotationSpeed;
    }

    public int getSpeedOfFan() {
        return speedOfFan;
    }

    public void setSpeedOfFan(int speedOfFan) {
        this.speedOfFan = speedOfFan;
    }


    @Override
    public String toString() {
        return "Can2DataBean{" +
                "baseWalkingPushRodPositionSignal=" + baseWalkingPushRodPositionSignal +
                ", walkingSensorFaultInformation=" + walkingSensorFaultInformation +
                ", positionSignalOfBaseShiftPushRod=" + positionSignalOfBaseShiftPushRod +
                ", shiftSensorFaultInformation=" + shiftSensorFaultInformation +
                ", degreeOfPushBeforeWalking=" + degreeOfPushBeforeWalking +
                ", degreeOfPushAfterWalking=" + degreeOfPushAfterWalking +
                ", degreeOfPushBeforeShifting=" + degreeOfPushBeforeShifting +
                ", degreeOfPushAfterShifting=" + degreeOfPushAfterShifting +
                ", negativeControlSignalInput1=" + negativeControlSignalInput1 +
                ", negativeControlSignalInput2=" + negativeControlSignalInput2 +
                ", negativeControlSignalInput3=" + negativeControlSignalInput3 +
                ", negativeControlSignalInput4=" + negativeControlSignalInput4 +
                ", negativeControlSignalInput5=" + negativeControlSignalInput5 +
                ", negativeControlSignalInput6=" + negativeControlSignalInput6 +
                ", negativeControlSignalInput7=" + negativeControlSignalInput7 +
                ", negativeControlSignalInput8=" + negativeControlSignalInput8 +
                ", negativeControlSignalInput9=" + negativeControlSignalInput9 +
                ", negativeControlSignalInput10=" + negativeControlSignalInput10 +
                ", negativeControlSignalInput11=" + negativeControlSignalInput11 +
                ", negativeControlSignalInput12=" + negativeControlSignalInput12 +
                ", negativeControlSignalInput13=" + negativeControlSignalInput13 +
                ", negativeControlSignalInput14=" + negativeControlSignalInput14 +
                ", negativeControlSignalInput15=" + negativeControlSignalInput15 +
                ", negativeControlSignalInput16=" + negativeControlSignalInput16 +
                ", negativeControlSignalInput17=" + negativeControlSignalInput17 +
                ", negativeControlSignalInput18=" + negativeControlSignalInput18 +
                ", negativeControlSignalInput19=" + negativeControlSignalInput19 +
                ", negativeControlSignalInput20=" + negativeControlSignalInput20 +
                ", negativeControlSignalInput21=" + negativeControlSignalInput21 +
                ", negativeControlSignalInput22=" + negativeControlSignalInput22 +
                ", negativeControlSignalInput23=" + negativeControlSignalInput23 +
                ", negativeControlSignalInput24=" + negativeControlSignalInput24 +
                ", negativeControlSignalInput25=" + negativeControlSignalInput25 +
                ", negativeControlSignalInput26=" + negativeControlSignalInput26 +
                ", negativeControlSignalInput27=" + negativeControlSignalInput27 +
                ", negativeControlSignalInput28=" + negativeControlSignalInput28 +
                ", negativeControlSignalInput29=" + negativeControlSignalInput29 +
                ", negativeControlSignalInput30=" + negativeControlSignalInput30 +
                ", negativeControlSignalInput31=" + negativeControlSignalInput31 +
                ", negativeControlSignalInput32=" + negativeControlSignalInput32 +
                ", powerOut1=" + powerOut1 +
                ", powerOut2=" + powerOut2 +
                ", powerOut3=" + powerOut3 +
                ", powerOut4=" + powerOut4 +
                ", powerOut5=" + powerOut5 +
                ", powerOut6=" + powerOut6 +
                ", powerOut7=" + powerOut7 +
                ", powerOut8=" + powerOut8 +
                ", powerOut9=" + powerOut9 +
                ", powerOut10=" + powerOut10 +
                ", powerOut11=" + powerOut11 +
                ", powerOut12=" + powerOut12 +
                ", powerOut13=" + powerOut13 +
                ", powerOut14=" + powerOut14 +
                ", powerOut15=" + powerOut15 +
                ", powerOut16=" + powerOut16 +
                ", powerOut17=" + powerOut17 +
                ", powerOut18=" + powerOut18 +
                ", powerOut19=" + powerOut19 +
                ", powerOut20=" + powerOut20 +
                ", powerOut21=" + powerOut21 +
                ", powerOut22=" + powerOut22 +
                ", powerOut23=" + powerOut23 +
                ", powerOut24=" + powerOut24 +
                ", proportionalValveOutput1=" + proportionalValveOutput1 +
                ", proportionalValveOutput2=" + proportionalValveOutput2 +
                ", proportionalValveOutput3=" + proportionalValveOutput3 +
                ", proportionalValveOutput4=" + proportionalValveOutput4 +
                ", negativeOut1=" + negativeOut1 +
                ", negativeOut2=" + negativeOut2 +
                ", negativeOut3=" + negativeOut3 +
                ", negativeOut4=" + negativeOut4 +
                ", pushRod2HOutput=" + pushRod2HOutput +
                ", pushRod2LOutput=" + pushRod2LOutput +
                ", pushRod4HOutput=" + pushRod4HOutput +
                ", pushRod4LOutput=" + pushRod4LOutput +
                ", turnLeftLightSignal=" + turnLeftLightSignal +
                ", rightTurnLightSignal=" + rightTurnLightSignal +
                ", highBeamSignal=" + highBeamSignal +
                ", nearLightSignal=" + nearLightSignal +
                ", signalOfProfileLight=" + signalOfProfileLight +
                ", rearFogLamp=" + rearFogLamp +
                ", mainDrivingSeatBelt=" + mainDrivingSeatBelt +
                ", passengerSeatBelt=" + passengerSeatBelt +
                ", positionLight=" + positionLight +
                ", parkingSignal=" + parkingSignal +
                ", powerGenerationSignal=" + powerGenerationSignal +
                ", reverseSignal=" + reverseSignal +
                ", fuelLevel=" + fuelLevel +
                ", hydraulicOilTemperature=" + hydraulicOilTemperature +
                ", gasTankPressure=" + gasTankPressure +
                ", cuttingTableAngleSensor=" + cuttingTableAngleSensor +
                ", unloadingCylinderAngleSensor=" + unloadingCylinderAngleSensor +
                ", modeOfWork=" + modeOfWork +
                ", autopilotStatus=" + autopilotStatus +
                ", rotationSpeedOfTheWheel=" + rotationSpeedOfTheWheel +
                ", axialFlowDrumSpeed=" + axialFlowDrumSpeed +
                ", grainAugerRotationSpeed=" + grainAugerRotationSpeed +
                ", speedOfFan=" + speedOfFan +
                '}';
    }
}
