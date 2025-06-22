import java.util.Arrays;

public class Problem_35 {

    // https://leetcode.com/problems/search-insert-position/description/

    public static void main(String[] args) {
        System.out.println("Index value of element either it is at this location or it should be on this location :: "+ searchInsert(new int[]{1,3,5,6},2));
    }

    public static int searchInsert(int[] nums, int target) {

        int res = Arrays.binarySearch(nums, target);
        if(res < 0){
            return Math.abs(res+1);
        }
        
        return res;
    }  
}
