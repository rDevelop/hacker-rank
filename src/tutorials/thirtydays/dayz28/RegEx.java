package tutorials.thirtydays.dayz28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<String> names = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            String regex = "@gmail.com";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(emailID);
            if(m.find()){
                names.add(firstName);
            }
        }
        Collections.sort( names);
                //(String s1, String s2) -> (s1.compareTo(s2)));
        names.forEach(n -> System.out.println(n));
        scanner.close();
    }

}
