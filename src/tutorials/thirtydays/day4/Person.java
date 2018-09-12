package tutorials.thirtydays.day4;

import java.util.Scanner;

public class Person {
    private int age;

    public Person(int initialAge) {
        age = initialAge;
        // Add some more code to run some checks on initialAge
        if(age < 0) {
            age = 0;System.out.println("Age is not valid, setting age to 0.");
        }

    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String label="";
        if( age < 13) {
            label = "You are young.";
        } else if ( age >= 13 && age < 18) {
            label = "You are a teenager.";
        } else {
            label = "You are old.";

        }
        System.out.println(label);
    }

    public void yearPasses() {
        // Increment this person's age.
        age ++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Person p = new Person(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}