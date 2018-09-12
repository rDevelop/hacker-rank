package tutorials.thirtydays.dayz26;

import java.util.Scanner;

public class Nested {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String returnDate = scanner.nextLine();
        String[] s = returnDate.split(" ");
        int returnDay = Integer.parseInt(s[0]);
        int returnMonth = Integer.parseInt(s[1]);
        int returnYear = Integer.parseInt(s[2]);
        String dueDate = scanner.nextLine();
        s = dueDate.split(" ");
        int dueDay = Integer.parseInt(s[0]);
        int dueMonth = Integer.parseInt(s[1]);
        int dueYear = Integer.parseInt(s[2]);

        int fine = 0;
        if( returnYear > dueYear ) {
            fine = 10000;
        } else if (returnYear == dueYear && returnMonth > dueMonth) {
            fine = 500 * (returnMonth - dueMonth);
        } else if (returnDay > dueDay && returnYear == dueYear && returnMonth == dueMonth) {
            fine = 15 *  (returnDay - dueDay);
        }
        System.out.println(fine);


    }
}
