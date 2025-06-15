import java.util.HashMap;

public class Problem_1 {

    //https://leetcode.com/problems/two-sum/

    public static void main(String[] args) {
        
        for(int num : twoSum(new int[]{7,11,15,2},9)){System.out.println(num);};
    }

    public static int[] twoSum(int[] arr,int target){

        HashMap<Integer,Integer> numAndPos = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int num2 = target - arr[i];

            if(numAndPos.containsKey(num2)){

                return new int[] {i, numAndPos.get(num2)};
            } else{
                numAndPos.put(arr[i],i);
            }
        }

        return null;
    }
    
}
