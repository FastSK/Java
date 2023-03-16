package Collection.Stack_Sort;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * Scan the input and save them into a stack
 * Then, sort it in increasing order.
 * @author Sunkwon Kim <kimsu@merrimack.edu>
 * @version 1.0.0
 * @since week 5 of csc6301
 */

class Main {
    /**
     * Main method of the class
     * @param args default parameter for a main - not used
     */
    public static void main(String[] args) {
        // Creating object of the class stack
        Stack<Integer> stack = new Stack<>();

        // Asking for the input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: (press 'x' to exit)");

        // Scan the input and add it to stack
        while (sc.hasNextInt() && !sc.hasNext("x")) {
            System.out.println("Enter number: (press 'x' to exit)");
            int number = sc.nextInt();

            // add the integer to the stack
            stack.push(number);
            System.out.println("List Before sorting : " + stack);
        }

        // sort the stack using Collections Framework
        Collections.sort(stack);

        // printing the sorted list.
        System.out.println("List After sorting : " + stack);

        // sort the stack in reverse order using Collection
        Collections.sort(stack, Collections.reverseOrder());
        System.out.println(stack);
    }
}
