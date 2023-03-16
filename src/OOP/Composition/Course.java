package OOP.Composition;

import OOP.Student;

import java.util.ArrayList;
import java.util.List;

public class Course {
    String name;
    private List<Student> students;

    // constructor
    public Course(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    // getter
    public List<Student> getStudents() {
        return students;
    }
}

class Program {
    String programName;
    private List<Course> courses;

    Program(String programName) {
        this.programName = programName;
        this.courses = new ArrayList<Course>();
    }

    public void addCourse(String name, List<Student> students) {
        Course c = new Course(name, students);
        this.courses.add(c);
    }
}

//class Main {
//    public static void main(String[] args) {
//
//    }
//}