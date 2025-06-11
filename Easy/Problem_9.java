public class Problem_9 {

    //https://leetcode.com/problems/palindrome-number/

    public static void main(String[] args){

        boolean isPalindrome = isPalindrome(121);
        System.out.println("Is the number a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(int x){

        int reverseNumber = 0;
        int originalNumber = x;

        if(originalNumber < 0){
            return false;
        }

        while(originalNumber != 0){

            int lastDigit = originalNumber % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            originalNumber = originalNumber / 10;
        }

        return reverseNumber == x;
    }
    
}
