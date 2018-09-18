package practice.algorithms.precision;

import java.util.Scanner;

public class PlusMinus {


    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i : arr) {
            if (i < 0) {
                neg++;
            } else if (i > 0) {
                pos++;
            } else {
                zero++;
            }
        }
        System.out.printf("%.6f%n", ((double) pos / arr.length));
        System.out.printf("%.6g%n", ((double) neg / arr.length));
        System.out.printf("%.6g%n", ((double) zero / arr.length));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }

}
