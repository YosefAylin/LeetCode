class Solution {
    public int[] sumZero(int n) {
        int res[] = new int[n];
        int run = 1;
        if (n % 2 != 0) {
                res[n - 1] = 0;
            }
        for (int i = 0; i < n - 1; i++) {
            res[i++] = run;
            res[i] = -run;
            run++;
        }
        return res; 
    }
}