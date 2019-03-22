public class HEVElectricCar extends ElectricCar{

    private double iCERelianceRate;



    public HEVElectricCar(int modelYear, String manufacturer, double tireSize, String color, double regenRate, int numbOfElectricsMotors, double batteryCapacity, double iCERelianceRate) {
        super(modelYear, manufacturer, tireSize, color, regenRate, numbOfElectricsMotors, batteryCapacity);
        this.iCERelianceRate = iCERelianceRate;
    }

    public HEVElectricCar(double regenRate, int numbOfElectricsMotors, double batteryCapacity, double iCERelianceRate) {
        super(regenRate, numbOfElectricsMotors, batteryCapacity);
        this.iCERelianceRate = iCERelianceRate;
    }

    public HEVElectricCar(double iCERelianceRate) {
        this.iCERelianceRate = iCERelianceRate;
    }

    public double getiCERelianceRate() {
        return iCERelianceRate;
    }

    public void setiCERelianceRate(double iCERelianceRate) {
        this.iCERelianceRate = iCERelianceRate;
    }

    @Override
    public String toString() {
        return "HEVElectricCar{" +
                "iCERelianceRate=" + iCERelianceRate +
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
