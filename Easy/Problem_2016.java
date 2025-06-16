public class Problem_2016 {

    //https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/?envType=daily-question&envId=2025-06-16

    public static void main(String[] args) {
        
        System.out.println("Max Diff is :: "+ getMaxDiff(new int[]{7,1,5,4}));
        System.out.println("Brute force solution :: "+ getMaxDiffBruteForce(new int[]{7,1,5,4}));
    }

    // O(n)

    public static int getMaxDiff(int[] arr){

        int max = -1;
        int currentMin = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > currentMin){

                max = Math.max(max, arr[i] - currentMin);
            }

            if(arr[i] < currentMin){

                currentMin = arr[i];
            }
        }

        return max;
    }

    // O(N^2)
    public static int getMaxDiffBruteForce(int[] arr){

        int max = -1;

        for(int i = 0; i < arr.length; i++){
            for(int j = i +1; j < arr.length; j++){
                
                max = Math.max(max, arr[j] - arr[i]);
            }
        }

        return max;
    }

}
