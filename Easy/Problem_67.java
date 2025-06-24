public class Problem_67 {

    public static void main(String[] args) {
        System.out.println("Sum of binaries :: "+addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {

        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        StringBuilder s = new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0){

            int ad = (i >=0) ? a.charAt(i) - '0' : 0;
            int bd = (j >=0) ? b.charAt(j) - '0' : 0;

            int sum = ad + bd + carry;

            s.append(sum % 2);

            carry = sum / 2;

            i--;
            j--;
        }

        return s.reverse().toString();
    }
    
}
