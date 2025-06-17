public class Problem2078{

    // https://leetcode.com/problems/two-furthest-houses-with-different-colors/

    public static void main(String[] args) {
        
        System.out.println("Max distance from diff color is :: "+ findMaxDistance(new int[]{1,8,3,8,3}));
        System.out.println("Max distance from diff color is :: "+ findMaxDistanceFast(new int[]{1,8,3,8,3}));
    }

    // O(n^2)
    public static int findMaxDistance(int[] colors){

        int max = 0;

        for(int i=colors.length-1; i >= 0; i--){
            for(int j=0; j<colors.length; j++){
                if(colors[i] != colors[j]){
                    max = Math.max(max,Math.abs(i-j));
                }
            }
        }
        return max;
    }

    //O(n)

    public static int findMaxDistanceFast(int[] colors){

        int p = 1;
        int n = colors.length;

        int m1 = Integer.MIN_VALUE;
        int m2 = Integer.MIN_VALUE;

        while(p < n){

            if(colors[0] != colors[p]){
                m1 = Math.max(m1, Math.abs(p-0));
            }

            if(colors[p] != colors[n-1]){
                m2 = Math.max(m2, Math.abs(n-1-p));
            }

            p++;
        }

        return Math.max(m1,m2);
    }
    
}