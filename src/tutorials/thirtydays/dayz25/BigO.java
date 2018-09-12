package tutorials.thirtydays.dayz25;

import java.util.*;

public class BigO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            boolean prime = true;
            int number = sc.nextInt();
            if( number == 2) {
                prime = true;
            } else if (number == 1 || number%2 == 0) {
                prime = false;
            } else {
                for (int i = 2; i*i <= number; i++) {
                    if (number % i == 0) {
                        prime = false;
                        continue;
                    }
                }
            }
            String output = prime ? "Prime" : "Not prime";
            System.out.println(output);
        }
    }
}
