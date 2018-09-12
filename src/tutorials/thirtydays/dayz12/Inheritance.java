package tutorials.thirtydays.dayz12;

import java.util.Scanner;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }
}


class Student extends Person {
    private int[] testScores;

    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        testScores = scores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    public String calculate() {
        int totals = 0;
        for(int i = 0; i < testScores.length; i ++ ) {
            totals += testScores[i];
        }
        int averageScore = totals/ testScores.length;
        String letterGrade = "T";
        if( averageScore >= 90) {
            letterGrade = "O";
        } else if ( averageScore >= 80 ) {
            letterGrade = "E";
        } else if ( averageScore >= 70 ) {
            letterGrade = "A";
        }
        else if ( averageScore >= 55 ) {
            letterGrade = "P";
        }
        else if ( averageScore >= 40 ) {
            letterGrade = "D";
        }
        // else defaults to T
        return letterGrade;
    }
}

class Inheritance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
