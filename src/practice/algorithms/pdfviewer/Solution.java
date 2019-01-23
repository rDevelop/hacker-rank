package practice.algorithms.pdfviewer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {

        char maxChar = 'a';
        for(char c: word.toCharArray()) {
            if(c > maxChar) {
                maxChar = c;
            }
        }
        int maxHeight = 1;
        for (int i='a'; i<= maxChar; i++) {
            if( h[i - 97] > maxHeight ) {
                maxHeight = h[i - 97];
                if( maxHeight == 7 ) {
                    break;
                }
            }

        }
        return word.length() * maxHeight;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);
        System.out.println("result   " + result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}