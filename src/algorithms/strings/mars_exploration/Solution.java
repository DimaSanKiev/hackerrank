package algorithms.strings.mars_exploration;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        int result = 0;
        for (int i = 0; i < S.length(); i += 3) {
            if (S.charAt(i) != 'S') {
                result++;
            }
            if (S.charAt(i + 1) != 'O') {
                result++;
            }
            if (S.charAt(i + 2) != 'S') {
                result++;
            }
        }
        System.out.print(result);
    }
}
