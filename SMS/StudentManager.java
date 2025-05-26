package SMS;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> student;

    public StudentManager() {
        this.student = new ArrayList<>();
    }

    // Methods

    // 1.Add new students
    public void addStudent(Student s) {
        student.add(s);
        System.out.println("Student added successfully!");
    }

    // 2.View Students All Details
    public void viewStudents() {
        if (student.isEmpty()) {
            System.out.println("Students not found");
        } else {
            System.out.println("***Student List***");
            for (Student st : student) {
                System.out.println(st);
            }
        }
    }

    // 3.Search Student by id
    public Student searchStudent(int id) {
        for (Student st : student) {
            if (st.getId() == id) {
                return st;
            }
        }
        return null;
    }

    // 4.update Student
    public void updateStudent(int id) {

        Scanner scan = new Scanner(System.in);

        for (Student st : student) {
            if (st.getId() == id) {
                System.out.println("Student found. Enter new details:");

                System.out.println("New name:");
                String newName = scan.nextLine();
                st.setName(newName);

                System.out.println("New age:");
                int newAge = scan.nextInt();
                scan.nextLine();
                st.setAge(newAge);

                System.out.println("New Grade:");
                String newGrade = scan.nextLine();
                st.setGrade(newGrade);

                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student with Id: " + id + " not found.");
    }

    // 5.Delete Student
    public void deleteStudent(int id) {
        for (Student st : student) {
            if (st.getId() == id) {
                student.remove(st);
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student with Id: " + id + " not found.");
    }
}
