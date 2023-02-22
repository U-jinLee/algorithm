package _code_wars;

import java.util.ArrayList;
import java.util.List;

/**
 * Digit*Digit
 */
public class SquareDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
        System.out.println(squareDigits(0));
        System.out.println(refineSquareDigits(9119));
    }

    public static int squareDigits(int n) {
        List<Integer> nums = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            nums.add(n%10);
            n /= 10;
        }

        for (int i = nums.size() - 1; i >= 0; i--) result.append((int) Math.pow(nums.get(i), 2));

        return result.toString().isEmpty() ? 0 : Integer.parseInt(result.toString());
    }

    public static int refineSquareDigits(int n) {
        String result = "";
        for (char c : String.valueOf(n).toCharArray()) {
           int digit = Character.digit(c, 10);
            result += digit * digit;
        }
        return Integer.parseInt(result);
    }

}