package algorithms.strings.camel_case;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] chars = s.toCharArray();
        int wordCount = 0;

        if (chars.length > 0) {
            wordCount = 1;
        }

        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                wordCount++;
            }
        }

        System.out.print(wordCount);
    }
}