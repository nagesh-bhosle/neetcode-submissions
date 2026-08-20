class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int maxLength = 0;
        int currLength = 1;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1) && set.contains(nums[i] + 1)) {
                int temp = nums[i] + 1;
                while (set.contains(temp)) {
                    currLength++;
                    temp++;
                }
                maxLength = Math.max(currLength, maxLength);
                currLength=1;
            }
        }
        maxLength = Math.max(currLength, maxLength);
        return maxLength;
    }
}
