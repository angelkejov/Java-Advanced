package university;

import java.util.ArrayList;
import java.util.List;

public class University {

    private int capacity;
    private List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getStudentsCount(List<Student> students) {
        return students.size();
    }

    public String registerStudent(Student student) {
        String output = "";
        if (capacity > 0) {
            if (!students.contains(student)) {
                output = "Added student " + student.getFirstName() + " " + student.getSecondName();
//                capacity--; ?
            } else {
                output = "Student is already in the university";
            }
        } else {
            output = "No seats in the university";
        }

        return output;
    }

    public String dismissStudent(Student student) {
        String output = "";

        String s = student.getFirstName();

        for (Student student1 : this.students) {
            System.out.println("kur");
        }

        return output;
    }


//    public String getStudent(String firstName, String secondName) {
//
//    }
}
