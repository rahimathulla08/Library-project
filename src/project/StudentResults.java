package project;

import java.util.Scanner;

class InvalidMarksException extends Exception {

    InvalidMarksException(String message) {
        super(message);
    }
}

public class StudentResults {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter English Marks: ");
            int english = sc.nextInt();

            System.out.print("Enter Mathematics Marks: ");
            int mathematics = sc.nextInt();

            System.out.print("Enter Java Marks: ");
            int java = sc.nextInt();

            System.out.print("Enter Database Marks: ");
            int database = sc.nextInt();

            checkMarks(english);
            checkMarks(mathematics);
            checkMarks(java);
            checkMarks(database);

            int total = english + mathematics + java + database;

            double percentage = total / 4.0;

            System.out.println();
            System.out.println("----- Student Result -----");
            System.out.println("English      : " + english);
            System.out.println("Mathematics  : " + mathematics);
            System.out.println("Java         : " + java);
            System.out.println("Database     : " + database);

            System.out.println("Total Marks  : " + total);
            System.out.println("Percentage   : " + percentage + "%");

        }
        catch (InvalidMarksException e) {

            System.out.println(e.getMessage());

        }
        catch (Exception e) {

            System.out.println("Invalid input. Please enter numbers only.");

        }
        finally {

            System.out.println("Result Processing Completed.");

        }

        sc.close();
    }

    static void checkMarks(int marks) throws InvalidMarksException {

        if (marks > 100) {

            throw new InvalidMarksException(
                    "Marks cannot be greater than 100"
            );
        }

        if (marks < 0) {

            throw new InvalidMarksException(
                    "Marks cannot be negative"
            );
        }
    }
}
