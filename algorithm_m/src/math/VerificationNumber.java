package math;

import java.util.Scanner;

public class VerificationNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int result = 0;

        for(int i = 0; i < 5; i++) {
            total += Math.pow(sc.nextInt(), 2);
        }
        result = total % 10;

        System.out.println(result);
    }

}