package tutorials.thirtydays.dayz10;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryNumbers {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();

        int count=0;
        int longest = 0;
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int originalN = n;
        while(n > 0){

            int remainder = n%2;
            n = n/2;
            list.push(remainder);
            if(remainder == 1) {
                count++;
                if( count > longest) {
                    longest  = count;
                }
            } else {
                count = 0;
            }


        }
        System.out.println(list);
        System.out.println(Integer.toBinaryString(originalN));
        System.out.println(longest);
        scanner.close();
    }

}


