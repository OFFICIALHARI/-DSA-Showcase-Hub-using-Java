package util;
import java.util.*;

public class SortedStudentList {
    TreeSet<String> students;
    Scanner sc;

    public SortedStudentList() {
        students = new TreeSet<>();
        sc = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        if (students.add(name)) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Student already exists!");
        }
    }

    public void displayStudents() {
        System.out.println("\n--- Sorted Student List ---");
        for (String name : students) {
            System.out.println(name);
        }
    }

    public void menu() {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void main(String[] args) {
        SortedStudentList app = new SortedStudentList();
        app.menu();
    }
}
