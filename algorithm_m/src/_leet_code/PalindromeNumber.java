package _leet_code;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;

        int compareNum = x;
        long result = 0;

        Queue<Integer> queue = new LinkedList<>();

        while (x > 0) {
            queue.add(x%10);
            x /= 10;
        }

        int size = queue.size() - 1;

        for (Integer i : queue) {
            result += i * Math.pow(10, size);
            size --;
        }

        if(result - compareNum == 0) return true;

        return false;
    }

}