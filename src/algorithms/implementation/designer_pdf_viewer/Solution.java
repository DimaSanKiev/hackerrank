package algorithms.implementation.designer_pdf_viewer;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for (int h_i = 0; h_i < n; h_i++) {
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        char[] abc = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        int maxH = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int index = indexOf(c, abc);
            if (h[index] > maxH) {
                maxH = h[index];
            }
        }

        int square = maxH * word.length();
        System.out.print(square);
    }

    private static int indexOf(char c, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
