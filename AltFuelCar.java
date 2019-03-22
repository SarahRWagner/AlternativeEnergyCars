abstract class AltFuelCar extends AlternativeEnergyCar{

    protected String fuelCellType;

    public AltFuelCar(int modelYear, String manufacturer, double tireSize, String color, double price, String fuelCellType) {
        super(modelYear, manufacturer, tireSize, color, price);
        this.fuelCellType = fuelCellType;
    }
    public AltFuelCar(){
        this.fuelCellType = "onboard";
    }
    public AltFuelCar(String fuelCellType) {
        this.fuelCellType = fuelCellType;
    }

    public String getFuelCellType() {
        return fuelCellType;
    }

    public void setFuelCellType(String fuelCellType) {
        this.fuelCellType = fuelCellType;
    }

    @Override
    public String toString() {
        return "AltFuelCar{" +
                "fuelCellType='" + fuelCellType + '\'' +
                ", modelYear=" + modelYear +
                ", manufacturer='" + manufacturer + '\'' +
                ", tireSize=" + tireSize +
                ", color='" + color + '\'' +
                '}';
    }


}
