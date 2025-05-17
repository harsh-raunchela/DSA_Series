package Day_9.FindKthBitinNthBinaryString;

class Solution {
    public char findKthBit(int n, int k) {
        // Base case
        if (n == 1) return '0';

        int mid = (int) Math.pow(2, n - 1);

        if (k == mid) {
            return '1';
        } else if (k < mid) {
            return findKthBit(n - 1, k);
        } else {
            int mirrorK = (int) Math.pow(2, n) - k;
            char bit = findKthBit(n - 1, mirrorK);
            return bit == '0' ? '1' : '0';
        }
    }
}