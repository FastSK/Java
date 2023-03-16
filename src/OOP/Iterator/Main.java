package OOP.Iterator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Make a collection
        ArrayList<String> ToDos = new ArrayList<>();
        ToDos.add("Trip to Mexico");
        ToDos.add("Make 5M");
        ToDos.add("Run a sustainable company");
        ToDos.add("Massage to Sarah");

        // Get the iterator
        Iterator<String> it = ToDos.iterator();

        // Print the first item
        System.out.println("1. " + it.next());

        // Looping through a collection
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
