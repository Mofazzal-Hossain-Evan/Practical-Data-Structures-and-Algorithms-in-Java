package Vehicle;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        //without instance
        vehicles.add(new Vehicle("Honda","accord", 1900,false));

        //with instance
        Vehicle v1 = new Vehicle("toyota","accordon", 1800,true);

        vehicles.add(new Vehicle("jeep","accordin", 19900,false));

        //
        vehicles.add(v1);

for (Vehicle cars : vehicles){
    System.out.println(cars);
    //System.out.println(cars.getMake());
    //System.out.println(cars.price);
}
    }
}
