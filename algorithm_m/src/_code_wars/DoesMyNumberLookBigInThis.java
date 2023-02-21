package _code_wars;

import java.util.ArrayList;
import java.util.List;

public class DoesMyNumberLookBigInThis {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
        System.out.println(isNarcissistic(1634));
        System.out.println(isNarcissistic(112));
    }
    public static boolean isNarcissistic(int number) {
        int result = 0;
        int num = number;
        List<Integer> val = new ArrayList<>();
        while(number > 0) {
            val.add(number % 10);
            number /= 10;
        }

        for (Integer integer : val)
            result += Math.pow(integer, val.size());

        // TODO replace with your code
        return result == num ? true : false;
    }
}
