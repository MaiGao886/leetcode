package leetcode_1_6;

public class Solution {
    public String convert(String s, int numRows) {
        //按行循环，创建一个新的char[s.length()],循环每行将结果写入数组
        //每个Z之间有步长，相当于将字符串分组，每组长度为2*(numRows-1)
        int len = s.length();
        if (numRows > len) {
            return s;
        }
        char[] chars = new char[len];
        int groupLen = 2 * (numRows - 1);
        for (int i = 0; i < numRows; i++) {


        }


        return null;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";


    }

}
