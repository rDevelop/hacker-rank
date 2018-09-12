package practice.algorithms.strings;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BearAndSteadyGene {
    // Complete the steadyGene function below.
    static int steadyGene(String gene) {
        int  units = gene.length() / 4;

        char[] C = new char[units];
        char[] G = new char[units];
        char[] A = new char[units];
        char[] T = new char[units];
        char[] chars = gene.toCharArray();
        for(int i=0; i<chars.length; i++) {

        }



        return 0;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("gene.txt"))) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String gene = scanner.nextLine();

            int result = steadyGene(gene);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        scanner.close();
    }
}
