public class HydrogenCar extends AltFuelCar {



    private double hydrogenLevel;
    private double hydrogenOxygenRatio;

    public HydrogenCar(int modelYear, String manufacturer, double tireSize, String color, String fuelCellType, double hydrogenLevel, double hydrogenOxygenRatio) {
        super(modelYear, manufacturer, tireSize, color, fuelCellType);
        this.hydrogenLevel = hydrogenLevel;
        this.hydrogenOxygenRatio = hydrogenOxygenRatio;
    }

    public HydrogenCar(double hydrogenLevel, double hydrogenOxygenRatio) {
        this.hydrogenLevel = hydrogenLevel;
        this.hydrogenOxygenRatio = hydrogenOxygenRatio;
    }

    public HydrogenCar(String fuelCellType, double hydrogenLevel, double hydrogenOxygenRatio) {
        super(fuelCellType);
        this.hydrogenLevel = hydrogenLevel;
        this.hydrogenOxygenRatio = hydrogenOxygenRatio;
    }






    public double getHydrogenLevel() {
        return hydrogenLevel;
    }

    public void setHydrogenLevel(double hydrogenLevel) {
        this.hydrogenLevel = hydrogenLevel;
    }

    public double getHydrogenOxygenRatio() {
        return hydrogenOxygenRatio;
    }

    public void setHydrogenOxygenRatio(double hydrogenOxygenRatio) {
        this.hydrogenOxygenRatio = hydrogenOxygenRatio;
    }

    @Override
    public String toString() {
        return "HydrogenCar{" +
                "hydrogenLevel=" + hydrogenLevel +
                ", hydrogenOxygenRatio=" + hydrogenOxygenRatio +
                ", fuelCellType='" + fuelCellType + '\'' +
                ", modelYear=" + modelYear +
                ", manufacturer='" + manufacturer + '\'' +
                ", tireSize=" + tireSize +
                ", color='" + color + '\'' +
                '}';
    }

}
