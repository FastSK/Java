package Collection.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> presidents = new LinkedList<>();
        presidents.add("a");
        presidents.add("d");
        presidents.add("k");
        presidents.add("p");
        System.out.println("LinkedList : " + presidents);

        ListIterator<String> it = presidents.listIterator();
        while(it.hasNext()) {
            String p = it.next();

            if (p.compareTo("b") > 0) {
                it.previous();
                it.add("b");
                break;
            }
        }

        presidents.add("o");
        System.out.println("Updated LinkedList: " + presidents);
    }
}
