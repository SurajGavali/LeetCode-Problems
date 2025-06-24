public class Problem_69 {

    // https://leetcode.com/problems/sqrtx/description/

    public static void main(String[] args) {
        
        System.out.println("Sqrt of number is :: "+mySqrt(8));
    }

    public static int mySqrt(int x) {

        if (x < 0) return (int)Double.NaN;
        double guess = x;
        double epsilon = 1e-10; // precision
        while (Math.abs(guess * guess - x) > epsilon) {
            guess = (guess + x / guess) / 2.0;
        }
        return (int)guess;
    }
    
}
