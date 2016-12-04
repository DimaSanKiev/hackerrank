package algorithms.implementation.mini_max_sum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        long[] arr = {a, b, c, d, e};
        Arrays.sort(arr);

        long minSum = 0;
        long maxSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            minSum += arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            maxSum += arr[i];
        }

        System.out.print(minSum + " " + maxSum);
    }
}
