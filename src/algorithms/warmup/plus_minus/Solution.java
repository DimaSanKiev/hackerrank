package algorithms.warmup.plus_minus;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int arr_i = 0; arr_i < n; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        double neg = 0;
        double zero = 0;
        double pos = 0;

        for (int a : arr) {
            if (a > 0) {
                pos++;
            } else if (a == 0) {
                zero++;
            } else {
                neg++;
            }
        }

        System.out.println(pos / n);
        System.out.println(neg / n);
        System.out.println(zero / n);
    }
}
