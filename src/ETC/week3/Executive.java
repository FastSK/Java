package ETC.week3;

/**
 * Class Executive extends the class Employee
 * @author Sunkwon Kim <kimsu@merrimack.edu>
 * @version 1.0.0
 * @since week 3 of csc6301
 * @source https://condor.depaul.edu/sjost/csc212/examples.htm
 */


public class Executive extends Employee {
    private double bonus;

    public Executive(String name, char gender, int age, int id, double salary, double bonus) {
        // Call base class constructor
        super(name, gender, age, id, salary);

        // Set the Employee instance variables
        this.bonus = bonus;
    }

    public double getCompensation() {
        return salary + bonus;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", super.toString(), bonus);
    }

    public static void main(String[] args) {
        Employee person = new Executive("Sarah", 'F', 20, 24680, 200000, 100000);
        System.out.println("Id for person is " + person.getId());
        System.out.println("Compensation for person is " +
                person.getCompensation( ));
        System.out.println("Output of toString for p is ");
        System.out.println(person);
    }
}
