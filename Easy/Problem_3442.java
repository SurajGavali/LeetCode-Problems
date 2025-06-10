import java.util.Map;

public class Problem_3442 {

    //https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/?envType=daily-question&envId=2025-06-10

    public static void main(String[] args) {
        System.out.println("Difference is :: " + maximumDifference("aaaaabbchkiggggggggghfffffffffppppp"));
    }

    public static int maximumDifference(String s) {

        Map<Character, Integer> freqMap = new java.util.HashMap<>();
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int minEven = Integer.MAX_VALUE;
        int maxOdd = Integer.MIN_VALUE;

        for (int f : freqMap.values()) {
            if (f % 2 == 0) {
                minEven = Math.min(minEven, f);
            } else if (f % 2 == 1 && f > 0) {
                maxOdd = Math.max(maxOdd, f);
            }
        }

        return maxOdd - minEven;
    }
    
}
