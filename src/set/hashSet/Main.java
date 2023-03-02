package set.hashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();

        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Tofas");

        System.out.println(cars);
    }
}
