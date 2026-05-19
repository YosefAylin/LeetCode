class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0; int j = 0;
        while (nums1[i] != nums2[j]) {
            if (j == nums2.length - 1) { return -1; }
            if (nums1[i] > nums2[j]) {
                j++;
                continue;
            }

            if (i == nums1.length - 1) { return -1; }
            if (nums2[j] > nums1[i]) {
                i++;
                continue;
            }
        }
        return nums2[j];
    }
}