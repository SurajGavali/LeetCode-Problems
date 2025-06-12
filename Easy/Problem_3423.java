public class Problem_3423 {

    // https://leetcode.com/problems/maximum-difference-between-adjacent-elements-in-a-circular-array/?envType=daily-question&envId=2025-06-12


    public static void main(String[] args) {
        Problem_3423 problem = new Problem_3423();
        int[] nums = {1, 3, 6, 10, 15};
        System.out.println("Maximum adjacent distance: " + problem.maxAdjacentDistance(nums));
    }
    public int maxAdjacentDistance(int[] nums) {

        int end = nums.length - 1;
        int res = Math.abs(nums[end] - nums[0]);
        for(int i = 0; i < end; i++){
            res = Math.max(res, Math.abs(nums[i] - nums[i+1]));
        }

        return res;
    }
}