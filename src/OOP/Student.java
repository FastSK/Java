package OOP;

// Class Declaration (= Instantiating a class)
public class Student {
    // Instance Variables
    int id;
    String name;
    int age;
    String race;

    // Constructor Declaration of Class
    public Student  (int id, String name, int age, String race){
        this.id = id;
        this.name = name;
        this.age = age;
        this.race = race;
    }

    // method1
    public int getId() {
        return id;
    }

    // method2
    public String getName(){
        return name;
    }
    // method3
    public int getAge(){
        return age;
    }
    // method4
    public String getRace() {
        return race;
    }

    @Override
    public String toString(){
        return ("Hi my name is " + this.getName() + " wow");
    }


    public static void main(String[] args) {
        Student s1 = new Student(1, "sk", 40, "Asian"); // Creating an object of Student
        System.out.println(s1);  // toString
        System.out.println(s1.name);
    }
}
