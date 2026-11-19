package project;

import java.util.Scanner;

public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        boolean fail = false;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 1; i <= 5; i++) {

            int marks;

            while (true) {

                System.out.print("Enter marks for Subject " + i + ": ");
                marks = sc.nextInt();

                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println(
                        "Invalid marks. Enter marks between 0 and 100."
                    );
                }
            }

            total = total + marks;

            if (marks < 35) {
                fail = true;
            }
        }

        double average = total / 5.0;

        String grade;

        if (average >= 90) {
            grade = "A";
        } 
        else if (average >= 75) {
            grade = "B";
        } 
        else if (average >= 60) {
            grade = "C";
        } 
        else if (average >= 50) {
            grade = "D";
        } 
        else {
            grade = "F";
        }

        System.out.println("\n===== STUDENT RESULT =====");
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average + "%");

        if (fail) {
            System.out.println("Grade       : F");
            System.out.println("Result      : FAIL");
            System.out.println(
                "Reason      : Student scored below 35 in one or more subjects."
            );
        } 
        else {
            System.out.println("Grade       : " + grade);
            System.out.println("Result      : PASS");
        }

        sc.close();
    }
}
