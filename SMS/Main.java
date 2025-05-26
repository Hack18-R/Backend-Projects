package SMS;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // StudentManger object
        StudentManager sm = new StudentManager();

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Loop
        while (true) {
            System.out.println("****Student Management System****");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("***********\n");

            System.out.println("Enter choice:");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student Id: ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter name: ");
                    String name = scan.nextLine();

                    System.out.print("Enter age: ");
                    int age = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter grade: ");
                    String grade = scan.nextLine();

                    Student newStudent = new Student(id, name, age, grade);
                    sm.addStudent(newStudent);
                    break;

                case 2:
                    sm.viewStudents();
                    break;

                case 3:
                    System.out.println("Enter Id to search: ");
                    int sId = scan.nextInt();
                    Student foundStudent = sm.searchStudent(sId);

                    if (foundStudent != null) {
                        System.out.println("Student found: ");
                        System.out.println("ID: " + foundStudent.getId());
                        System.out.println("Name: " + foundStudent.getName());
                        System.out.println("Age: " + foundStudent.getAge());
                        System.out.println("Grade: " + foundStudent.getGrade());
                    } else {
                        System.out.println("Student not found with Id: " + sId);
                    }
                    break;

                case 4:
                    System.out.println("Enter Id to update: ");
                    int updateId = scan.nextInt();
                    sm.updateStudent(updateId);
                    break;

                case 5:
                    System.out.println("Enter Id to delete: ");
                    int deleteId = scan.nextInt();
                    sm.deleteStudent(deleteId);
                    break;

                case 6:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}