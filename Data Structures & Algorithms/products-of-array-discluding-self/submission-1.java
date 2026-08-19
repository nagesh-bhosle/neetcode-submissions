class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int product = 1;
        int noOfZeros = 0;
        for (int n : nums) {
            if (n == 0) {
                noOfZeros++;
            } else {
                product *= n;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (noOfZeros > 1 || (noOfZeros == 1 && nums[i] != 0)) {
                result[i] = 0;
            } else if (nums[i] == 0) {
                result[i] = product;
            } else {
                result[i] = product / nums[i];
            }
        }

        return result;
    }
}
