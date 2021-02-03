package leetcode_1_6;

public class Solution {
    public String convert(String s, int numRows) {
        int len = s.length();
        if (numRows > len) {
            return s;
        }
        StringBuilder builder = new StringBuilder();
        int numGroups = Math.floorDiv(len, 2 * numRows - 2);
        int numCols = numRows - 1;
        for (int i = 0; i < numGroups; i++) {
            for (int j = 0; j < 2 * numRows - 2; j++) {
                if (len > 2 * i * (numRows - 1) + (j / numRows) + (j % numRows)) {


                }
            }
        }


        return null;
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";


    }

}
