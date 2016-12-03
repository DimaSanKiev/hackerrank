package algorithms.warmup.time_conversion;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time12 = sc.nextLine();
        String time24 = "";

        if (time12.charAt(time12.length() - 2) == ('A')) {
            int hours = Integer.valueOf(time12.substring(0, 2));
            if (hours == 12) {
                hours -= 12;
            }
            String hoursStr = "";
            if (hours < 10) {
                hoursStr = "0" + String.valueOf(hours);
            }
            time24 = hoursStr + time12.substring(2, time12.length() - 2);
        }
        if (time12.charAt(time12.length() - 2) == ('P')) {
            int hours = Integer.valueOf(time12.substring(0, 2));
            hours += 12;
            if (hours == 24) {
                hours = 12;
            }
            String hoursStr;
            if (hours < 10) {
                hoursStr = "0" + String.valueOf(hours);
            } else {
                hoursStr = String.valueOf(hours);
            }

            time24 = hoursStr + time12.substring(2, time12.length() - 2);

        }

        System.out.print(time24);
    }
}