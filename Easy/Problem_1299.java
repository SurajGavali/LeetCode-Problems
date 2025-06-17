public class Problem_1299 {

    // https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/
    
    public static void main(String[] args) {

        int[] arr = new int[]{17,18,5,4,6,1};
        
        System.out.println("Array After Replacing highest element on right :: ");

        int[] res = findMaxElementsOnRightFast(arr);
        for(int n : res){System.out.print(n + ", ");}
    }

    public static int[] findMaxElementsOnRight(int[] arr){

        // O(n^2)

        if(arr.length == 1){
            return new int[]{-1};
        }

        

        for(int i = 0; i < arr.length; i++){
            int max = -1;

            for(int j = i+1; j < arr.length; j++){

                max = Math.max(max,arr[j]);
            }
            arr[i] = max;
        }

        return arr;
    }

    public static int[] findMaxElementsOnRightFast(int[] arr){

        int maxSofar = -1;

        for(int i=arr.length-1; i >= 0; i--){

            int current = arr[i];

            arr[i] = maxSofar;

            if(current > maxSofar){
                maxSofar = current;
            }
        }

        return arr;
    }
}
