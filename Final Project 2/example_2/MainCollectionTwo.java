import java.util.*;

public class MainCollectionTwo {

    public static void main(String[] args) {

        //Declaring a list of cars and its information and using the Cars class and its methods
        Cars vehicle1 = new Cars("Toyota", 1995, "Supra");
        Cars vehicle2 = new Cars("Dodge", 2017, "Ram");
        Cars vehicle3 = new Cars("BMW", 2017, "M3");

        //Creating an ArrayList of vehicles and adding each vehicle to the ArrayList
        ArrayList<Cars> vehicles = new ArrayList<>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);

        System.out.println(vehicles);

    }
}
