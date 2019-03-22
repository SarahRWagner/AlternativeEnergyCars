/**
 * @author Sarah Wagner
 * This is the answer to question 3 on the midterm exam. This class builds an AlternativeEnergyCar object.
 * An alternative car has a model year, a manufactuerer, a tire size, a color, and price. The methods in the class are the
 *  mutagens, accessors and toString.
 */
public class AlternativeEnergyCar implements Comparable <AlternativeEnergyCar>
{
    //data is kept private
    protected int modelYear;
    protected String manufacturer;
    protected double tireSize;
    protected String color;
    protected double price;

    /**
     * This will print out what makes up a AlternativeEnergyCar object
     * @return String
     */
    @Override
    public String toString() {
        return "AlternativeEnergyCar{" +
                "modelYear=" + modelYear +
                ", manufacturer='" + manufacturer + '\'' +
                ", tireSize=" + tireSize +
                ", color='" + color + '\'' +
                ", price='" + price +
                '}';
    }

    /**
     * This is the constructor that takes in parameters for the AlternativeEnergyCar object.
     * @param modelYear int
     * @param manufacturer String
     * @param tireSize double
     * @param color String
     * @param price double
     */
    public AlternativeEnergyCar(int modelYear, String manufacturer, double tireSize, String color, double price) {
        this.modelYear = modelYear;
        this.manufacturer = manufacturer;
        this.tireSize = tireSize;
        this.color = color;
        this.price = price;
    }

    /**
     * This is the default constructor. This automatically sets the values of the variables to these values.
     */
    public AlternativeEnergyCar() {
        this.modelYear = 2019;
        this.manufacturer = "Tesla";
        this.tireSize = 20.0;
        this.color = "Black";
        this.price = 80000.0;
    }

    /**
     * This gets the model year and returns it to the user.
     * @return int
     */
    public int getModelYear() {
        return modelYear;
    }

    /**
     * This sets the model year to whatever the user decides.
     * @param modelYear int
     */
    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    /**
     * This gets the manufactuerer name and returns it to the user.
     * @return String
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * This sets the manufactuere to whatever the user decides.
     * @param manufacturer String
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * This gets the tire size and returns it to the user.
     * @return double
     */
    public double getTireSize() {
        return tireSize;
    }

    /**
     * This sets the tire size to whatever the user decides.
     * @param tireSize double
     */
    public void setTireSize(double tireSize) {
        this.tireSize = tireSize;
    }

    /**
     * This gets the color of the car and returns it to the user.
     * @return String
     */
    public String getColor() {
        return color;
    }

    /**
     * This sets the color to whatever the user decides.
     * @param color String
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * This gets the price and returns it to the user.
     * @return double
     */
    public double getPrice(){
        return price;
    }

    /**
     * This sets the price to whatever the user decides.
     * @param price double
     */
    public void setPrice(double price){
        this.price = price;
    }

    /**
     * This compares the price of the current car to to a comparision car.
     * @param compareCar AlternativeEnergyCar
     * @return int
     */
    public int compareTo(AlternativeEnergyCar compareCar){

        if(this.getPrice() < compareCar.getPrice()){
            return -1;
        }
        else if(this.getPrice() == compareCar.getPrice()){
            return 0;
        }
        else{
            return 1;
        }
    }

}
