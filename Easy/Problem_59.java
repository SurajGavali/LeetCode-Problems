public class Problem_59{

    // https://leetcode.com/problems/length-of-last-word/

    public static void main(String[] args) {

        System.out.println("Length of last word :: "+ lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println("Length of last word faster :: "+ lengthOfLastWordFast("   fly me   to   the moon  "));
        
    }

    //Slower
    public static int lengthOfLastWord(String s) {

        String[] arr = s.trim().split("\\s+");
        
        return arr[arr.length-1].length();
    }

    //Faster
    public static int lengthOfLastWordFast(String s) {

        int i = s.length() -1;
        int count = 0;

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        while(i >= 0 && s.charAt(i) != ' '){
            i--;
            count++;
        }
        
        return count;
    }

}