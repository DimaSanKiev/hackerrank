package algorithms.implementation.sock_merchant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;

        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
            if (map.get(c[c_i]) == null) {
                map.put(c[c_i], 1);
            } else {
                map.put(c[c_i], map.get(c[c_i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result = result + entry.getValue() / 2;
        }

        System.out.print(result);
    }
}