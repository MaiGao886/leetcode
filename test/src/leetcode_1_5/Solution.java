package leetcode_1_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 *
 * 示例 1：
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 * 输入：s = "cbbd"
 * 输出："bb"
 * 示例 3：
 * 输入：s = "a"
 * 输出："a"
 * 示例 4：
 * 输入：s = "ac"
 * 输出："a"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public String longestPalindrome(String s) {


        return null;
    }
private String a ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Objects.equals(a, solution.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    public static void main(String[] args) {

        String s = "aba";
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer.reverse().toString().equals(s));

    }
}
