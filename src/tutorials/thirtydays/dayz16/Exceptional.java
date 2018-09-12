package tutorials.thirtydays.dayz16;

import java.util.Scanner;

public class Exceptional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int I = 0;
        try {
            I = Integer.parseInt(S);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
            return;
        }
        System.out.println(I);

    }
}
