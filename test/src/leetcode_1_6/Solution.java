package leetcode_1_6;

import java.util.Arrays;

public class Solution {
    public String convert(String s, int numRows) {
        //按行循环，创建一个新的char[s.length()],循环每行将结果写入数组
        //每个Z之间有步长，相当于将字符串分组，每组长度为2*(numRows-1)
        int len = s.length();
        if (numRows > len || numRows == 1) { //快速判断只有一列情况，直接返回原字符串
            return s;
        }
        char[] chars = new char[len];
        int groupLen = 2 * (numRows - 1);//行数为1时，每组的长度有问题，所以单行不适用，或修改该值
        int index = 0;
        for (int i = 0; i < numRows; i++) {
            int sep = 0;
            if (i == 0 || i == numRows - 1) {
                //第一行和最后一行都只有一个字符，其他行为两个字符
                while (sep + i < len) {
                    chars[index++] = s.charAt(i + sep);
                    sep += groupLen;
                }
            } else {
                while (sep + i < len) {
                    chars[index++] = s.charAt(i + sep);
                    sep += groupLen;
                    if (sep - i < len) {
                        chars[index++] = s.charAt(sep - i);
                    }
                }
            }

        }


        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "P";
        Solution solution = new Solution();
        String convert = solution.convert(s, 1);
        System.out.println(convert);

    }

}
