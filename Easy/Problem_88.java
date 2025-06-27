public class Problem_88 {

    //https://leetcode.com/problems/merge-sorted-array/

    public static void main(String[] args) {
        
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // pointer for nums1
        int j = n - 1; // pointer for nums2
        int k = m + n - 1; // pointer for placement in nums1

        // Merge from the end to avoid overwriting nums1's values
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        // If any elements left in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
    
}
