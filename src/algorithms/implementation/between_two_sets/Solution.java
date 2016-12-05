package algorithms.implementation.between_two_sets;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for (int b_i = 0; b_i < m; b_i++) {
            b[b_i] = in.nextInt();
        }

        int result = 0;

        for (int i = a[a.length - 1]; i <= b[0]; i++) {
            boolean divA = true;
            boolean divB = true;

            for (int elA : a) {
                if (i % elA != 0) {
                    divA = false;
                    break;
                }
            }
            for (int elB : b) {
                if (elB % i != 0) {
                    divB = false;
                    break;
                }
            }
            if (divA && divB) {
                result++;
            }
        }

        System.out.print(result);
    }


}
