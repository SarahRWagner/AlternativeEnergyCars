abstract class ElectricCar extends AlternativeEnergyCar{

    protected double regenRate;
    protected int numbOfElectricsMotors;
    protected double batteryCapacity;



    public ElectricCar(int modelYear, String manufacturer, double tireSize, String color, double price, double regenRate, int numbOfElectricsMotors, double batteryCapacity) {
        super(modelYear, manufacturer, tireSize, color, price);
        this.regenRate = regenRate;
        this.numbOfElectricsMotors = numbOfElectricsMotors;
        this.batteryCapacity = batteryCapacity;
    }


    public ElectricCar() {
        this.regenRate = 50.0;
        this.numbOfElectricsMotors = 4;
        this.batteryCapacity = 25.0;
    }



    public double getRegenRate() {
        return regenRate;
    }

    public void setRegenRate(double regenRate) {
        this.regenRate = regenRate;
    }

    public int getNumbOfElectricsMotors() {
        return numbOfElectricsMotors;
    }

    public void setNumbOfElectricsMotors(int numbOfElectricsMotors) {
        this.numbOfElectricsMotors = numbOfElectricsMotors;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    @Override
    public String toString() {
        return "ElectricCar{" +
                "regenRate=" + regenRate +
                ", numbOfElectricsMotors=" + numbOfElectricsMotors +
                ", batteryCapacity=" + batteryCapacity +
                ", modelYear=" + modelYear +
                ", manufacturer='" + manufacturer + '\'' +
                ", tireSize=" + tireSize +
                ", color='" + color + '\'' +
                '}';
    }



}
