package com.codewithphencharaud;

import java.util.*;

class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int spent = -1;
        Arrays.sort(keyboards);
        Arrays.sort(drives);

        for (int i = keyboards.length - 1; i >= 0; i--) {
            for (int j = drives.length - 1; j >= 0; j--) {
                int total = keyboards[i] + drives[j];

                if (total <= b) {
                    spent = Math.max(spent, total);
                }
            }
        }
        return spent;
    }

    public static class Main {

        public void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int b = in.nextInt();
            int n = in.nextInt();
            int m = in.nextInt();
            int[] keyboards = new int[n];
            for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
                keyboards[keyboards_i] = in.nextInt();
            }
            int[] drives = new int[m];
            for (int drives_i = 0; drives_i < m; drives_i++) {
                drives[drives_i] = in.nextInt();
            }
            int moneySpent = getMoneySpent(keyboards, drives, b);
            System.out.println(moneySpent);
        }
    }

}