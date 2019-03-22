/**
 * @author Sarah Wagner
 * @version 1.0
 * This is my driver class. This will answer questions 6 and 7 on the midterm.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        // Creating different AltEnergyCars to show the polymorphism
        AlternativeEnergyCar kiaNiro = new PHEVElectricCar(2018, "Kia", 25.0, "White", 60000.0, 1.0, 1, 1.56, "Optima", 2.5);
        AlternativeEnergyCar hyundaiNexo = new HydrogenCar(2019, "Hyundai", 25.0, "blue", 70000.0, "Hydrogen", 80.0, 70.0);
        AlternativeEnergyCar stanleySteamer = new SteamCar(1912, "Stanley Motor Carriage Company", 30.0, "Green", 500.0,"Steam",40.0, "Gas" );
        AlternativeEnergyCar prius = new HEVElectricCar(2018, "Toyota", 25.0, "red", 20000.0, 1.0, 1, 1.8, 50.0);

        // Adding the different objects into a list
        ArrayList<AlternativeEnergyCar> carCollection = new ArrayList<>();
        carCollection.add(kiaNiro);
        carCollection.add(hyundaiNexo);
        carCollection.add(stanleySteamer);
        carCollection.add(prius);

        // Sorting the objects by price
        Collections.sort(carCollection);
    }
}
