package tutorials.thirtydays.dayz14;

import java.util.Scanner;

class Difference {
    private int[] elements;
    public int maximumDifference;


    public Difference(int[] elements) {
        this.elements = elements;

    }


    public void computeDifference(){
        maximumDifference = 0;
        for(int i = elements.length-1; i >= 0; i -- ) {
           for(int j = elements.length-1; j >= 0; j-- ) {
               if(i==j) {
                   continue;
               }
               int diff = Math.abs(elements[i] - elements[j]);
               if(diff > maximumDifference) {
                   maximumDifference = diff;
               }
           }
        }
    }


}


public class Day14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}