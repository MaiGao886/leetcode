package leetcode_1_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
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
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public String longestPalindrome(String s) {
        //暴力解法
        int len = s.length();
        if (len < 2) {
            return s;
        }
        int maxlen = 1;
        int begin = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxlen && isPalindrome(chars, i, j)) {
                    maxlen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxlen);
    }

    public boolean isPalindrome(char[] chars, int start, int end) {
        while (start < end) {
            if (chars[start] != chars[end])
                return false;
            start++;
            end--;
        }
        return true;
    }

    public String longestPalindrome2(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }
        int begin = 0;
        int maxLen = 1;

        boolean[][] bp = new boolean[length][length];
        for (int i = 0; i < length; i++) {
            bp[i][i] = true;
        }
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) != s.charAt(j)) {
                    bp[i][j] = false;
                } else {
                    if (i - j < 3) {
                        bp[i][j] = true;
                    } else {
                        bp[i][j] = bp[i - 1][j + 1];
                    }
                }
                if (bp[i][j] && i - j + 1 > maxLen) {
                    maxLen = i - j + 1;
                    begin = j;
                }

            }
        }

        return s.substring(begin, begin + maxLen);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long l = System.currentTimeMillis();
        String s = solution.longestPalindrome2("esbtzjaaijqkgmtaajpsdfiqtvxsgfvijpxrvxgfumsuprzlyvhclgkhccmcnquukivlpnjlfteljvykbddtrpmxzcrdqinsnlsteonhcegtkoszzonkwjevlasgjlcquzuhdmmkhfniozhuphcfkeobturbuoefhmtgcvhlsezvkpgfebbdbhiuwdcftenihseorykdguoqotqyscwymtjejpdzqepjkadtftzwebxwyuqwyeegwxhroaaymusddwnjkvsvrwwsmolmidoybsotaqufhepinkkxicvzrgbgsarmizugbvtzfxghkhthzpuetufqvigmyhmlsgfaaqmmlblxbqxpluhaawqkdluwfirfngbhdkjjyfsxglsnakskcbsyafqpwmwmoxjwlhjduayqyzmpkmrjhbqyhongfdxmuwaqgjkcpatgbrqdllbzodnrifvhcfvgbixbwywanivsdjnbrgskyifgvksadvgzzzuogzcukskjxbohofdimkmyqypyuexypwnjlrfpbtkqyngvxjcwvngmilgwbpcsseoywetatfjijsbcekaixvqreelnlmdonknmxerjjhvmqiztsgjkijjtcyetuygqgsikxctvpxrqtuhxreidhwcklkkjayvqdzqqapgdqaapefzjfngdvjsiiivnkfimqkkucltgavwlakcfyhnpgmqxgfyjziliyqhugphhjtlllgtlcsibfdktzhcfuallqlonbsgyyvvyarvaxmchtyrtkgekkmhejwvsuumhcfcyncgeqtltfmhtlsfswaqpmwpjwgvksvazhwyrzwhyjjdbphhjcmurdcgtbvpkhbkpirhysrpcrntetacyfvgjivhaxgpqhbjahruuejdmaghoaquhiafjqaionbrjbjksxaezosxqmncejjptcksnoq");
        System.out.println(System.currentTimeMillis() - l);
        System.out.println(s);

    }
}
