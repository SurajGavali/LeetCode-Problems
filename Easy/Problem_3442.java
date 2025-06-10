import java.util.Map;
import java.util.OptionalLong;
import java.util.stream.Collectors;

public class Problem_3442 {

    //https://leetcode.com/problems/maximum-difference-between-even-and-odd-frequency-i/description/?envType=daily-question&envId=2025-06-10

    public static void main(String[] args) {
        System.out.println("Difference is :: " + maximumDifference("aaaaabbchkiggggggggghfffffffffppppp","stream"));
    }

    public static int maximumDifference(String s,String mode) {

        if (mode.equalsIgnoreCase("stream")) {
            
            // Step 1: Create a frequency map using streams
            Map<Character, Long> freqMap = s.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

            // Step 2: Use streams to find max odd and min even frequencies
            OptionalLong maxOdd = freqMap.values().stream()
                    .filter(freq -> freq % 2 == 1)
                    .mapToLong(Long::longValue)
                    .max();

            OptionalLong minEven = freqMap.values().stream()
                    .filter(freq -> freq % 2 == 0)
                    .mapToLong(Long::longValue)
                    .min();

            // Step 3: Return the difference
            // Per problem description, there's at least one odd and one even frequency
            return (int) (maxOdd.getAsLong() - minEven.getAsLong());

        } else {
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
    
}
