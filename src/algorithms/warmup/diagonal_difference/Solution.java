package algorithms.warmup.diagonal_difference;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for (int a_i = 0; a_i < n; a_i++) {
            for (int a_j = 0; a_j < n; a_j++) {
                a[a_i][a_j] = in.nextInt();
            }
        }

        int sum1 = 0;
        int sum2 = 0;

        int posi = 0;
        int posj = 0;
        while (posj <= n - 1) {
            sum1 += a[posi][posj];
            posi++;
            posj++;
        }

        posi = 0;
        posj = n - 1;
        while (posj >= 0) {
            sum2 += a[posi][posj];
            posi++;
            posj--;
        }

        System.out.print(Math.abs(sum1 - sum2));

    }
}