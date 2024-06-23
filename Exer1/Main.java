package Exer1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many students?");
        int N = input.nextInt();
        
        Student[] studentList = new Student[N+1]; // array of N students of Student type
        
        for (int i = 1; i <= N; i++) {
            studentList[i] = new Student(); // create object for each student
            
            System.out.println("Enter student " + i + " information: ");
            
            System.out.println("Enter student name: ");
            String name = input.next();
            
            System.out.println("Enter student roll: ");
            int roll = input.nextInt();
            
            System.out.println("Enter student age: ");
            int age = input.nextInt();
            
            System.out.println("Enter student grade: ");
           double grade = input.nextDouble();
            
            // add student information to Student class
            studentList[i].setName(name);
            studentList[i].setRoll(roll);
            studentList[i].setAge(age);
            studentList[i].setGrade(grade);
            
            System.out.println(".............");
        }
        
        int choice;
        do {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Display All Students");
            System.out.println("2. Search Student by Roll Number");
            System.out.println("3. Update Student Information");
            System.out.println("4. Delete Student Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            
            switch (choice) {
                case 1:
                    displayAllStudents(studentList, N);
                    break;
                case 2:
                    searchStudentByRollNumber(input, studentList, N);
                    break;
                case 3:
                    updateStudentInfo(input, studentList, N);
                    break;
                case 4:
                    studentList = deleteStudentRecord(input, studentList, N);
                    N--;
                    break;
                case 5:
                    System.out.println("Exiting Student Management System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    // Method to display all student records
    public static void displayAllStudents(Student[] studentList, int N) {
        System.out.println("Student information display");
        for (int i = 1; i <= N; i++) {
            System.out.println("Student :" + i);
            studentList[i].toDisplayInfo();
        }
    }

    // Method to search for a student by roll number
    public static void searchStudentByRollNumber(Scanner input, Student[] studentList, int N) {
        System.out.print("Enter roll for searching: ");
        int searchRoll = input.nextInt();
        
        boolean found = false;
        for (int i = 1; i <= N; i++) {
            if (studentList[i].getRoll() == searchRoll) {
                studentList[i].toDisplayInfo();
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Student with roll number " + searchRoll + " not found.");
        }
    }

    // Method to update student information
    public static void updateStudentInfo(Scanner input, Student[] studentList, int N) {
        System.out.print("Enter roll number to update: ");
        int roll = input.nextInt();
        
        boolean found = false;
        for (int i = 1; i <= N; i++) {
            if (studentList[i].getRoll() == roll) {
                System.out.println("Enter new name: ");
                String name = input.next();
                System.out.println("Enter new age: ");
                int age = input.nextInt();
                System.out.println("Enter new grade: ");
                double grade = input.nextDouble();
                
                studentList[i].setName(name);
                studentList[i].setAge(age);
                studentList[i].setGrade(grade);
                
                System.out.println("Student information updated successfully.");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Student with roll number " + roll + " not found.");
        }
    }

    // Method to delete a student record
    public static Student[] deleteStudentRecord(Scanner input, Student[] studentList, int N) {
        System.out.print("Enter roll number to delete: ");
        int roll = input.nextInt();
        
        boolean found = false;
        for (int i = 1; i <= N; i++) {
            if (studentList[i].getRoll() == roll) {
                for (int j = i; j < N; j++) {
                    studentList[j] = studentList[j + 1];
                }
                studentList[N] = null; // Remove the last element
                System.out.println("Student record deleted successfully.");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Student with roll number " + roll + " not found.");
        }
        
        return studentList;
    }
}
