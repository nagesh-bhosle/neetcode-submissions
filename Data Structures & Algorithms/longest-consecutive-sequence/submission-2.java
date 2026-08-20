class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int[] temp = nums.clone();
        Arrays.sort(temp);

        int length = 1;
        int maxLength = 0;

        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == temp[i - 1]) {
                continue;
            } else if (temp[i] - temp[i - 1] == 1) {
                length++;
            } else {
                maxLength = Math.max(maxLength, length);
                length = 1;
            }
        }
        maxLength = Math.max(maxLength, length);
        return maxLength;
    }
}
