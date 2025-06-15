import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem_15 {

    public static void main(String[] args) {

        int[] nums = {1, 0, -1, 0, -1, 1};
        List<List<Integer>> result = threeSum(nums);
        System.out.println(result);
        
    }

    public static List<List<Integer>> threeSum(int[] nums){

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i < nums.length; i++){

            if((i > 0) && (nums[i] == nums[i-1])){
                continue;
            }

            int j = i+1;
            int k = nums.length - 1;

            while(j < k){

                int total = nums[i] + nums[j] + nums[k];

                if(total > 0){
                    k--;
                } else if(total < 0){
                    j++;
                } else{

                    List<Integer> subList = new ArrayList<>();

                    subList.add(nums[i]);
                    subList.add(nums[j]);
                    subList.add(nums[k]);

                    res.add(subList);

                    j++;

                    while((nums[j] == nums[j-1]) && (j < k)){
                        j++;
                    }

                }
            }
        }

        return res;
    }
    
}
