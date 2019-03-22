import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        AlternativeEnergyCar kiaNiro = new PHEVElectricCar(2018, "Kia", 25.0, "White", 1.0, 1, 1.56, "Optima", 2.5);
        AlternativeEnergyCar hyundaiNexo = new HydrogenCar(2019, "Hyundai", 25.0, "blue", "Hydrogen", 80.0, 70.0);
        AlternativeEnergyCar stanleySteamer = new SteamCar(1912, "Stanley Motor Carriage Company", 30.0, "Green", "Steam",40.0, "Gas" );


        ArrayList<AlternativeEnergyCar> carCollection = new ArrayList<>();
        carCollection.add(kiaNiro);
        carCollection.add(hyundaiNexo);
        carCollection.add(stanleySteamer);

    }
}
