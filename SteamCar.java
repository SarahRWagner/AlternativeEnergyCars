public class SteamCar extends AltFuelCar{


    private double pressureGauge;
    private String heatSource;

    public SteamCar(int modelYear, String manufacturer, double tireSize, String color,double price, String fuelCellType, double pressureGauge, String heatSource) {
        super(modelYear, manufacturer, tireSize, color, price, fuelCellType);
        this.pressureGauge = pressureGauge;
        this.heatSource = heatSource;
    }

    public double getPressureGauge() {
        return pressureGauge;
    }

    public void setPressureGauge(double pressureGauge) {
        this.pressureGauge = pressureGauge;
    }

    public String getHeatSource() {
        return heatSource;
    }

    public void setHeatSource(String heatSource) {
        this.heatSource = heatSource;
    }
    @Override
    public String toString() {
        return "SteamCar{" +
                "pressureGauge=" + pressureGauge +
                ", heatSource='" + heatSource + '\'' +
                ", fuelCellType='" + fuelCellType + '\'' +
                ", modelYear=" + modelYear +
                ", manufacturer='" + manufacturer + '\'' +
                ", tireSize=" + tireSize +
                ", color='" + color + '\'' +
                '}';
    }




}
