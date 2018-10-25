package practice.algorithms.numbers;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        /*
        input
        256741038 623958417 467905213 714532089 938071625
        output
        2063136757 2744467344
        */

        /*
        7 69 2 221 8974
        299 9271
        */

        // stream to longs, sort, add all numbers skipping first
        Long max = Arrays.stream(arr).asLongStream()
                .sorted()
                .skip(1)
                .sum();

        // stream to long, sort, add all numbers up to 4th number
        Long min = Arrays.stream(arr).asLongStream()
                .sorted()
                .limit(4)
                .sum();

        System.out.println(min + " " + max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
