package tutorials.thirtydays.day6;

import java.util.Scanner;

public class Day6 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(T < 0 || T > 10) {
            System.out.println("Enter number between 1 and 1043");
            T = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");;
        }
        String[] evenWords = new String[T];
        String[] oddWords = new String[T];
        for(int i = 0; i < T; i++) {
            String evenWord = "";
            String oddWord= "";
            String S = scanner.nextLine();
            char[] characters = S.toCharArray();
            for(int j=0; j< characters.length; j++) {
                if(j%2 == 0){
                    evenWord += characters[j];
                } else {
                    oddWord += characters[j];
                }
            }
            evenWords[i] = evenWord;
            oddWords[i] = oddWord;
        }
        for(int i=0; i < evenWords.length; i++) {
            System.out.println(evenWords[i] + " " + oddWords[i]);
        }

    }

}
