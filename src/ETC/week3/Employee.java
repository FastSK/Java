package ETC.week3;

/**
 * Class Employee extends the class Person
 * @author Sunkwon Kim <kimsu@merrimack.edu>
 * @version 1.0.0
 * @since week 3 of csc6301
 * @source https://condor.depaul.edu/sjost/csc212/examples.htm
 */


public class Employee extends Person{
    private int id;
    protected double salary;

    public Employee(String name, char gender, int age, int id, double salary) {
        // call base class constructor
        super(name, gender, age);

        // set the Employee instance variables
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getCompensation() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %d %.2f", super.toString(), id, salary);
    }

    public static void main(String[] args) {
        Employee person = new Employee("Sun", 'M', 10, 1357, 100000);
        System.out.println("Id for person is " + person.getId());
        System.out.println("Compensation for person is " + person.getCompensation( ));
        System.out.println("Output of toString for person is ");
        System.out.println(person);
    }
}
