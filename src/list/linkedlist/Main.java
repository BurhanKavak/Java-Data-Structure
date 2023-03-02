package list.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // LinkedList yapısını Kuyruk şeklinde oluşturuyoruz.
        Queue<String> languages = new LinkedList<>();

        // Eleman ekleme
        languages.add("Python");
        languages.add("Java");
        languages.add("C");
        System.out.println("LinkedList : " + languages);


        // İlk elemana ulaşmak istediğimizde
        String str1 = languages.peek();
        System.out.println("Erişilen : " + str1);

        // İlk elemana erişen ama listeden silen
        String str2 = languages.poll();
        System.out.println("Silinen değer : " + str2);
        System.out.println("poll methodu sonrası liste : " + languages);

        //  Listenin sonuna eleman ekleme
        languages.offer("C#");
        System.out.println("offer methodu sonrası liste : " + languages);



    }
}
