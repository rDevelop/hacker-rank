package tutorials.thirtydays.day3;

public class Day3 {
    public static void main(String[] args) {
        weirdTest(3);
        weirdTest(24);
    }

    public static void weirdTest(int N){
        boolean even = N%2 == 0? true : false;
        if( !even) {
            System.out.println("Weird");
        } else {
            if( N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if( N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }

    }
}
