package OOP.Aggregation;

import java.util.List;

/**
 * Aggregation
 * When an object of a Class A is associated to an object of
 * another Class B that is created outside Class A
 */
class Student {
    String name;
    int id;
    String dpt;

    public Student(String name, int id, String dpt) {
        this.name = name;
        this.id = id;
        this.dpt = dpt;
    }
}

class Course {
    String name;
    private List<Student> students;

    public Course(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
}

