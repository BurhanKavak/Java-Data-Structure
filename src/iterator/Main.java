package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("ArrayList : " + numbers);


        Iterator<Integer> iterator = numbers.iterator();

        int number = iterator.next();
        System.out.println("Erişilen eleman : " + number);

        iterator.remove();
        System.out.println("Silinen değer : " + number);

        System.out.print("Listenin Son Hali : ");

        while (iterator.hasNext()){
            iterator.forEachRemaining(val -> System.out.print(val + ", "));
        }
    }
}
