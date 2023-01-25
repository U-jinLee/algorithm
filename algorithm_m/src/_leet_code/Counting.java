package _leet_code;

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] example = new int[sc.nextInt()];

        for(int i = 0 ; i < example.length; i++) {
            example[i] = sc.nextInt();
        }

        int findInteger = sc.nextInt();
        System.out.println(counter(example, findInteger));
    }

    public static int counter(int[] example, int findInteger) {
        int count = 0;
        for (int i : example) {
            if(findInteger == i) count++;
        }
        return count;
    }
}
