public class PHEVElectricCar extends ElectricCar{

    private String plugType;
    private double chargeTime;



    public PHEVElectricCar(int modelYear, String manufacturer, double tireSize, String color, double regenRate, int numbOfElectricsMotors, double batteryCapacity, String plugType, double chargeTime) {
        super(modelYear, manufacturer, tireSize, color, regenRate, numbOfElectricsMotors, batteryCapacity);
        this.plugType = plugType;
        this.chargeTime = chargeTime;
    }

    public PHEVElectricCar(double regenRate, int numbOfElectricsMotors, double batteryCapacity, String plugType, double chargeTime) {
        super(regenRate, numbOfElectricsMotors, batteryCapacity);
        this.plugType = plugType;
        this.chargeTime = chargeTime;
    }

    public PHEVElectricCar(String plugType, double chargeTime) {
        this.plugType = plugType;
        this.chargeTime = chargeTime;
    }



    public String getPlugType() {
        return plugType;
    }

    public void setPlugType(String plugType) {
        this.plugType = plugType;
    }

    public double getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(double chargeTime) {
        this.chargeTime = chargeTime;
    }
    @Override
    public String toString() {
        return "PHEVElectricCar{" +
                "plugType='" + plugType + '\'' +
                ", chargeTime=" + chargeTime +
                ", regenRate=" + regenRate +
                ", numbOfElectricsMotors=" + numbOfElectricsMotors +
                ", batteryCapacity=" + batteryCapacity +
                ", modelYear=" + modelYear +
                ", manufacturer='" + manufacturer + '\'' +
                ", tireSize=" + tireSize +
                ", color='" + color + '\'' +
                '}';
    }
}
