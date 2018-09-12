package practice.algorithms.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Hacker Rank link to problem:
 * http://hr.gs/aacaef #programming
 */

public class BearAndSteadyGene {

    private static boolean isSteady(Map<Character, Integer> map, int n) {
        for (Integer i : map.values()) {
            if (i > n / 4) {
                return false;
            }
        }
        return true;
    }
    // Complete the steadyGene function below.
    static int steadyGene(String gene) {
        int n = gene.length();
        char[] chars = gene.toCharArray();
        Map<Character,  Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 0);
        map.put('G', 0);
        map.put('T', 0);
        for( Character c : chars ) {
            map.put( c, map.get(c) + 1);
        }

        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;
        while( right < n - 1) {
            char rChar = gene.charAt(right++);
            map.put(rChar, map.get(rChar) - 1);
            while(isSteady(map, n)){
                min = Math.min(min, right - left);
                char leftChar = gene.charAt(left ++);
                map.put(leftChar, map.get(leftChar) + 1);
            }
        }
        return min;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("gene.txt"))) {
            //int n = scanner.nextInt();
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            //String gene = scanner.nextLine();

            //int result = steadyGene(gene);
            int result = steadyGene("GAAATAAA");

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        scanner.close();
    }
}
