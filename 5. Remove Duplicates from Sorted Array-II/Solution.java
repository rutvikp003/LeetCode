public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int i = 2; // Start writing from the third position
        for (int j = 2; j < nums.length; j++) {
            // Compare current number with the number at i-2
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i; // Length of the array with duplicates removed
    }
}
