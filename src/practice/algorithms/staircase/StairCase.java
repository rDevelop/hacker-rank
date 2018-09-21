package practice.algorithms.staircase;

import java.util.Scanner;

public class StairCase {

    // Complete the staircase function below.
    static void staircase(int n) {
        String hashes = "";
        for(int i=0; i<n; i++) {
            hashes += "#";
        }
        while(n --> 1) {
            String space = String.format("%1$-"+n+"s", "");
            String line = hashes.replaceAll("^.{"+n+"}", space);
            System.out.println(line);
        }
        System.out.println(hashes);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        staircase(n);

        scanner.close();
    }
}
