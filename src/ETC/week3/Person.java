package ETC.week3;

/**
 * Person
 * Repeatedly swapping pairs of the adjacent elements if they are in the wrong order.
 * @author Sunkwon Kim <kimsu@merrimack.edu>
 * @version 1.0.0
 * @since week 3 of csc6301
 * @source https://condor.depaul.edu/sjost/csc212/examples.htm
 */

public class Person {
    private String name;
    private char gender;
    private int age;

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %c %d", name, gender, age);
    }


    public static void main(String[] args) {
        Person person = new Person("Sun", 'M', 10);
        System.out.println("Name of person is " + person.getName());
        System.out.println("Gender of person is " + person.getGender());
        System.out.println("Age of person is " + person.getAge());
        System.out.println("Output of toString for person : ");
        System.out.println(person);
    }
}
