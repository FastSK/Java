package Collection;

import java.util.Random;
import java.util.Scanner;

public class RSP {
    public static void main(String[] args) {
        //create input object to use its methods for getting use input
        Scanner sc = new Scanner (System.in);

        String guess = "";

        do {
            System.out.println("Enter (r)ock, (s)cissors, or (p)aper: ");
            guess = sc.nextLine();
            if (guess.equals("r") || guess.equals("s") || guess.equals("p")) {
                break;
            } else {
                System.out.println("Only 'r', 's', or 'p' are valid inputs! Please try again.");
            }
        } while (true);

        //create random input for the computer
        Random random = new Random();
        double rand = random.nextDouble();
        String comp = "";

        if (rand < 1.0/3.0) {
            comp = "r";
        } else if (rand < 2.0/3.0) {
            comp = "s";
        } else {
            comp = "p";
        }

        if (guess.equals(comp)) {
            System.out.println("It is a tie!");
        } else if ((guess.equals("r") && comp.equals("p"))
                    || (guess.equals("p") && comp.equals("s"))
                    || (guess.equals("s") && comp.equals("r"))) {
            System.out.println("Sorry, you lost at I had " + comp);
        } else {
            System.out.println("Congrats, you won as I had " + comp);
        }
    }
}


