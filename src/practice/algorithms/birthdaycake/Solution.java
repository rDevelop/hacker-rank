package practice.algorithms.birthdaycake;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {

        int max = 0;
        List<Integer> maxes = new ArrayList<>();
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] >= max) {
                max = ar[i];
                maxes.add(new Integer(max));
            }
        }
        Collections.sort(maxes);
        for (int i = 0; i < maxes.size(); i++) {
            if (maxes.get(0) < maxes.get(maxes.size() - 1)) {
                maxes.remove(maxes.get(0));
            } else if (maxes.get(i + 1) == max) {
                break;

            }
        }

        return maxes.size();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
            int arCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] ar = new int[arCount];

            String[] arItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < arCount; i++) {
                int arItem = Integer.parseInt(arItems[i]);
                ar[i] = arItem;
            }

            int result = birthdayCakeCandles(ar);
            System.out.println(result);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

        }

        scanner.close();
    }
}

