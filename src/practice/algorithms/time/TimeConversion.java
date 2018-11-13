package practice.algorithms.time;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TimeConversion {


    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {

        int hour;
        String formattedHour;
        String[] units = s.split(":");
        String code = units[2].substring(2,4);
        String minutes = units[2].substring(0,2);
        boolean isNight = code.equals("PM") ? true : false;
        hour = Integer.parseInt(units[0]);
        if(isNight) {
            if( hour == 12) {
                hour = 0;
            }
            int tmpHour = hour + 12;

            formattedHour = String.format("%02d", tmpHour);

        } else if (hour == 12){
            formattedHour = "00";
        } else {
            int tmpHour = hour;
            formattedHour = String.format("%02d", tmpHour);

        }

        String convertedTime = formattedHour + ":" + units[1] + ":" + minutes;
        return convertedTime;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {

            String s = scan.nextLine();

            String result = timeConversion(s);
            System.out.println(result);
            bw.write(result);
            bw.newLine();
        }
    }
}

