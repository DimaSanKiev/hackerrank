package algorithms.warmup.circular_array_rotation;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int m = in.nextInt();
            System.out.println(a[((m - k) % n + n) % n]);
        }

        in.close();
    }
}
