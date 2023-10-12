package _top_code;

import java.util.Arrays;

public class CryptoGraphy {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(encrypt(numbers));
    }

    public static int encrypt(int[] numbers) {
        int result = 1;

        Arrays.sort(numbers);
        numbers[0]++;

        for(int i = 0; i < numbers.length; i++) {
            result *= numbers[i];
        }

        return result;
    }
}
