class Solution {
    public int minMoves(int[] nums, int limit) {
        int[] diff = new int[limit*2 + 2];
        diff[2] += nums.length ;
        diff[limit * 2 + 1] -= nums.length;

        for (int i = 0; i < nums.length / 2; i++) {
            int left = nums[i]; int right = nums[nums.length - i - 1];
           

            // 0 moves
            diff[left+right] -= 1;
            diff[left+right+1] += 1;

            // 1 moves
            int minSumAllowed = Math.min(left, right) + 1;
            int maxSumAllowed = Math.max(left, right) + limit;
            diff[minSumAllowed] -= 1;
            diff[maxSumAllowed + 1] += 1;
        }

        int minMoves = nums.length; 
        int currentMoves = 0;

        for (int s = 2; s <= limit * 2; s++) {
            currentMoves += diff[s];
            minMoves = Math.min(minMoves, currentMoves);
        }

        return minMoves;
    }
}