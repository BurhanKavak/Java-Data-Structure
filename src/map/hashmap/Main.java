package map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Bilim", "12");
        map.put("Sanat", "3");
        map.put("Edebiyat", "5");
        map.put("Siyaset", "9");
        map.put("Java", "155");
        System.out.println();
        System.out.println("HashMap Ogeleri:");
        System.out.print("\t" + map);
    }
}
