class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int currLength = 1;
                int temp = nums[i] + 1;
                while (set.contains(temp)) {
                    currLength++;
                    temp++;
                }
                maxLength = Math.max(currLength, maxLength);
            }
        }
        return maxLength;
    }
}
