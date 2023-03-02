package map.linkedHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String,Double> languages = new LinkedHashMap<>();

        languages.put("Java",15.5);
        languages.put("C",12.3);
        languages.put("Python",10.0);
        languages.put("C#",13.4);

        // Mapin tüm anahtar/değer eşleşme kümesini dönderir
        Set set = languages.entrySet();

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}
