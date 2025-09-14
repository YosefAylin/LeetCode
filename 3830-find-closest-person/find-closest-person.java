class Solution {
    public int findClosest(int x, int y, int z) {
        int res = Integer.compare(Math.abs(z-y),Math.abs(z-x));
        if (res == -1) {
            return 2;
        }
        return res;
        
    }
}