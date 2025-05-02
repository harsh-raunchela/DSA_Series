package Day_6.FirstMissingPositive;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number at its correct index (i.e., nums[i] = i + 1)
        for (int i = 0; i < n; i++) {
            while (
                    nums[i] > 0 &&
                            nums[i] <= n &&
                            nums[nums[i] - 1] != nums[i]
            ) {
                // Swap nums[i] with the number at its target position
                int correctIdx = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }
        }

        // Step 2: Find the first index where nums[i] != i + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all positions are correct, then answer is n + 1
        return n + 1;
    }
}
