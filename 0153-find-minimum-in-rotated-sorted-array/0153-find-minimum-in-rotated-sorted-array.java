class Solution {
    public int findMin(int[] nums) {
        int m = 0;
        int n = nums.length - 1;

        while (m < n) {
            int mid = (n + m) / 2;

            if (nums[mid] > nums[n]) {
                m = mid + 1;
            } else {
                n = mid;
            }
        }

        return nums[m];
    }
}