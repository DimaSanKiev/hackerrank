package algorithms.implementation.kangaroo;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        int distance1 = x1;
        int distance2 = x2;
        String result = "";

        while (true) {
            distance1 += v1;
            distance2 += v2;

            if (distance1 == distance2) {
                result = "YES";
                break;
            }

            if (distance2 < distance1) {
                break;
            }
        }

        if (result.isEmpty()) {
            result = "NO";
        }

        System.out.print(result);
    }
}
