package set.linkedhashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();

        cities.add("Sivas");
        cities.add("Samsun");
        cities.add("Istanbul");

        Set set = cities;

        for (Iterator iterator = set.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
