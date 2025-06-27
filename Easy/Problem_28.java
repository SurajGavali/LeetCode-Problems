public class Problem_28 {

    // https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

    public static void main(String[] args) {
        System.out.println(strStr("butsad", "sad"));
    }

    public static int strStr(String haystack, String needle) {

        for(int i=0; i <= haystack.length() - needle.length(); i++){

            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1; 
    }
}
