package com.android.canlibrary.bean;

/**
 * 用来存储Can1的数据
 * FileName: Can1DataBean
 * Author: ccm
 * Date: 2023/10/18
 *
 */
public class Can1DataBean {
    /** 0x0CFE6CEE第七，八个字节 **/
    // 1.车速
    private int speedOfVehicle = -1;
    /** 0x0CF00400第四，五个字节 **/
    // 1.转速
    private int rotationalSpeed = -1;
    /** 0x18FE5600第一个字节 **/
    // 1.尿素低报警灯 <10%
    private int reactantAllowance = -1;
    /** 0x18FD7C00第一个字节 **/
    // 1.DPF警告灯 0-关闭 4-打开
    private int dpfWarningLight = -1;
    /** 0x18FD7C00第三个字节 **/
    // 2.DPF禁止 0-关闭 4-打开
    private int dpfProhibition = -1;
    /** 0x18FD7C00第四，五个字节 **/
    // 4.再生提醒灯 000-熄灭；001-常亮；010-慢闪；100-快闪
    private int driverWarningLight = -1;
    // 再生提醒  00-熄灭；01-常亮
    private int regenerativeReminder = -1;
    /** 0x18FD7C00第七个字节 **/
    // 5.排气温度过高报警灯 0-关闭 4-打开
    private int excessiveExhaustTemperature = -1;
    /** 0x18FEEE00第一个字节 **/
    // 1.冷却液温度过高警告灯 < 120
    private int waterTemperature = -1;
    /** 0x18FEEF00第四个字节 **/
    // 1.机油压力低报警 < 0.25kpa
    private int oilPressure = -1;
    /** 0x18FEFF00第四，五个字节 **/
    // 1.柴油发动机油水分离警告灯 0-关闭 3-打开
    private int waterInOil = -1;
    /** 0x18FEE400第四，五个字节 **/
    // 1.柴油发动机预热警告灯
    private int engineWarmUpLight = -1;
    /** 0x18FEF700第四，五个字节 **/
    // 1.充电系统故障警告灯 <18V
    private float engineInputVoltage = -1;
    /** 0x18FECA00第个字节 **/
    // 1.故障警告灯  0-关闭 1-打开
    private int faultCode = -1;

    public int getSpeedOfVehicle() {
        return speedOfVehicle;
    }

    public void setSpeedOfVehicle(int speedOfVehicle) {
        this.speedOfVehicle = speedOfVehicle;
    }

    public int getRotationalSpeed() {
        return rotationalSpeed;
    }

    public void setRotationalSpeed(int rotationalSpeed) {
        this.rotationalSpeed = rotationalSpeed;
    }

    public int getReactantAllowance() {
        return reactantAllowance;
    }

    public void setReactantAllowance(int reactantAllowance) {
        this.reactantAllowance = reactantAllowance;
    }

    public int getDpfWarningLight() {
        return dpfWarningLight;
    }

    public void setDpfWarningLight(int dpfWarningLight) {
        this.dpfWarningLight = dpfWarningLight;
    }

    public int getDpfProhibition() {
        return dpfProhibition;
    }

    public void setDpfProhibition(int dpfProhibition) {
        this.dpfProhibition = dpfProhibition;
    }

    public int getDriverWarningLight() {
        return driverWarningLight;
    }

    public void setDriverWarningLight(int driverWarningLight) {
        this.driverWarningLight = driverWarningLight;
    }

    public int getRegenerativeReminder() {
        return regenerativeReminder;
    }

    public void setRegenerativeReminder(int regenerativeReminder) {
        this.regenerativeReminder = regenerativeReminder;
    }

    public int getExcessiveExhaustTemperature() {
        return excessiveExhaustTemperature;
    }

    public void setExcessiveExhaustTemperature(int excessiveExhaustTemperature) {
        this.excessiveExhaustTemperature = excessiveExhaustTemperature;
    }

    public int getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public int getOilPressure() {
        return oilPressure;
    }

    public void setOilPressure(int oilPressure) {
        this.oilPressure = oilPressure;
    }

    public int getWaterInOil() {
        return waterInOil;
    }

    public void setWaterInOil(int waterInOil) {
        this.waterInOil = waterInOil;
    }

    public int getEngineWarmUpLight() {
        return engineWarmUpLight;
    }

    public void setEngineWarmUpLight(int engineWarmUpLight) {
        this.engineWarmUpLight = engineWarmUpLight;
    }

    public float getEngineInputVoltage() {
        return engineInputVoltage;
    }

    public void setEngineInputVoltage(float engineInputVoltage) {
        this.engineInputVoltage = engineInputVoltage;
    }

    public int getFaultCode() {
        return faultCode;
    }

    public void setFaultCode(int faultCode) {
        this.faultCode = faultCode;
    }

    @Override
    public String toString() {
        return "Can1DataBean1{" +
                "speedOfVehicle=" + speedOfVehicle +
                ", rotationalSpeed=" + rotationalSpeed +
                ", reactantAllowance=" + reactantAllowance +
                ", dpfWarningLight=" + dpfWarningLight +
                ", dpfProhibition=" + dpfProhibition +
                ", driverWarningLight=" + driverWarningLight +
                ", regenerativeReminder=" + regenerativeReminder +
                ", excessiveExhaustTemperature=" + excessiveExhaustTemperature +
                ", waterTemperature=" + waterTemperature +
                ", oilPressure=" + oilPressure +
                ", waterInOil=" + waterInOil +
                ", engineWarmUpLight=" + engineWarmUpLight +
                ", engineInputVoltage=" + engineInputVoltage +
                ", faultCode=" + faultCode +
                '}';
    }
}
