package tutorials.thirtydays.day2;

import java.util.Scanner;

public class Day2 {


    public static void main(String[] args) {
        mealPrice(12.0, 20, 8);
        mealPrice(15.0, 0, -1);
    }

    public static void mealPrice(double meal_cost, int tip_percent, int tax_percent) {

        double tip = meal_cost * (tip_percent/100.00);
        double tax = meal_cost * (tax_percent/100.00);

        double totalMealCost = meal_cost + tip + tax;
        System.out.println(totalMealCost);
        int totalCost = (int)Math.round(totalMealCost);
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }


    public static void scanMe() {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        int i2 = scan.nextInt();
        double d2 = scan.nextDouble();
        String s2 = "";


//        System.out.println(scan.nextLine());
        scan.nextLine();
        s2 = scan.nextLine();


        System.out.println(i + i2);
        System.out.println(d + d2);
        System.out.println(s + s2);

        scan.close();
    }

}