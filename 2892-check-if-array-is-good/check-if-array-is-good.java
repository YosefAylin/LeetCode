class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 0 || n == 1|| nums[n-1] != nums[n-2] || n - 1 != nums[n-1])
         return false;
        
        for (int i = 0; i < nums.length - 1; i++) {
            if (i + 1 != nums[i]) return false;
        }
        
        return true;
    }
}