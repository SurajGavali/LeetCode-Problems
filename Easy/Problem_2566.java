public class Problem_2566 {
    
    // https://leetcode.com/problems/maximum-difference-by-remapping-a-digit/?envType=daily-question&envId=2025-06-14

    public static void main(String[] args) {
        System.out.println("Diff is :: ");
        System.out.println(minMaxDifference(90));
    }
    public static int minMaxDifference(int num) {

        String numsString = Integer.toString(num);
        String tempString = numsString;

        char maxReplaceChar = '0';
        char minReplaceChar = '9';

        for(int i=0; i<numsString.length(); i++){

            if(numsString.charAt(i) != '9'){
                maxReplaceChar = numsString.charAt(i);
                break;
            }
        }

        for(int j=0; j<numsString.length(); j++){

            if(numsString.charAt(j) != '0'){
                minReplaceChar = numsString.charAt(j);
                break;
            }
        }

        numsString = numsString.replace(maxReplaceChar, '9');
        tempString = tempString.replace(minReplaceChar, '0');
        
        return Integer.parseInt(numsString) - Integer.parseInt(tempString);
    }
}
