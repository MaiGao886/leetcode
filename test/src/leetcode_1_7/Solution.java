package leetcode_1_7;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int reverse = solution.reverse2(-1999999999);
        System.out.println(reverse);
        System.out.println(Integer.MIN_VALUE);
    }

    public int reverse(int x) {
        ArrayList<Integer> integers = new ArrayList<>();
        boolean isFushu = false;
        if (x < 0) {
            isFushu = true;
            x = Math.abs(x);
        }

        while (x / 10 > 0 || x % 10 > 0) {
            int i = x % 10;
            x /= 10;
            integers.add(i);
        }
        long a = 0;
        for (int i = 0; i < integers.size(); i++) {
            a += (integers.get(i) * Math.pow(10, integers.size() - 1 - i));
        }
        if (isFushu) {
            a = -a;
        }
        if (a > Math.pow(2, 31) - 1 || a < -Math.pow(2, 31)) {
            a = 0;
        }
        return (int) a;
    }

    public int reverse2(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
}
