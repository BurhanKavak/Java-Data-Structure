package list.arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList oluşturma
        ArrayList<String> languages = new ArrayList<>();


        // Arraya ekleme işlemi
        languages.add("Java");
        languages.add("C");
        languages.add("Python");

        System.out.println("ArrayList : " + languages);


        // Listeyi tek tek tarayarak içindeki değerleri ekrana yazdırıyor.
        for (String language : languages) {
            System.out.print(language);
            System.out.print(",");
        }


    }
}
