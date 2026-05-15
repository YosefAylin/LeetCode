class Solution {
    public int findMin(int[] nums) {
        
        int left = nums[0]; int right = nums[nums.length - 1];

        if (nums.length == 1) { return left; }
        if (nums.length == 2) { return Math.min(left, right); }

        int i = 1; int j = nums.length - 2;

        if (left < nums[i] && right > left) { return left; }

       
        while (left > nums[i]) {
            left = nums[i];
            i++;
        }

        
        while (right > nums[j]) {
            right = nums[j];
            j--;
        }

        return Math.min(left, right);




    }
}