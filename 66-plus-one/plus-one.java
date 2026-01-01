class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] newarr = new int[n];

        // copy digits
        for (int i = 0; i < n; i++) {
            newarr[i] = digits[i];
        }

        // add one with carry handling
        for (int i = n - 1; i >= 0; i--) {
            if (newarr[i] < 9) {
                newarr[i]++;
                return newarr;
            }
            newarr[i] = 0;
        }

        // all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
