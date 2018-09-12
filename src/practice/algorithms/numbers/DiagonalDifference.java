package practice.algorithms.numbers;

import java.util.Scanner;

public class DiagonalDifference {

    /*
    Hacker Rank link
    http://hr.gs/fadeaa
    */


    // Complete the diagonalDifference function below.
    static int diagonalDifference(int[][] arr) {
        int n = arr[0].length;
        int primary = 0;
        int secondary = 0;
        for (int i = 0, j = n - 1; i < n; i++, j--) {

            primary += arr[i][i];
            secondary += arr[j][i];
        }
        return Math.abs(primary - secondary);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("difference.txt"))) {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);
        System.out.println("difference " + result);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
        //}
    }
}
