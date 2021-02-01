package leetcode_1_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 * <p>
 * 输入: s = ""
 * 输出: 0
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    /**
     * 思路：从第一个字符开始查询，使用hashSet集合判断是否重复
     */

    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len <= 0) {
            return 0;
        }
        int result = 0;
        int start = 0;//左指针所指索引
        int end = 0;//右指针所指索引
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add(s.charAt(0));
        while (start < len) {

            while (end + 1 < len && !hashSet.contains(s.charAt(end + 1))) {
                hashSet.add(s.charAt(++end));
            }
            result = Math.max(result, end + 1 - start);
            if (end + 1 == len) {
                break;
            }
            hashSet.remove(s.charAt(start));
            start++;

        }


        return result;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring2("abcabcbb"));

    }

    public int lengthOfLongestSubstring2(String s) {
        int len = s.length();
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int start = 0, end = 0; end < len; end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end)) + 1);
            }
            result = Math.max(result, end + 1 - start);
            map.put(s.charAt(end), end);
        }
        return result;

    }

}
