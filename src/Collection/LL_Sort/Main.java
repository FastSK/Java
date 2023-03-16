package Collection.LL_Sort;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Scan the input and save them into a linked list
 * Then, sort it in increasing order.
 * @author Sunkwon Kim <kimsu@merrimack.edu>
 * @version 1.0.0
 * @since week 4 of csc6301
 */

public class Main {
    /**
     * Main method of the class
     * @param args default parameter for a main - not used
     */
    public static void main(String[] args) {
        // Creating object of the class linked list
        LinkedList<Integer> list = new LinkedList<Integer>();

        // Asking for input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: (press 'x' to exit)");

        // scan the input and add it to linked list.
        while(sc.hasNextInt() && !sc.hasNext("x")) {

            System.out.println("Enter number: (press 'x' to exit)");
            int number = sc.nextInt();


            // add the integer to the linked list
            list.add(number);
            System.out.println("List Before sorting : " + list);
        }

        // sort the linked list using Collections Framework
        Collections.sort(list);

        // printing the sorted list.
        System.out.println("List After sorting : " + list);

        // sort in reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}

