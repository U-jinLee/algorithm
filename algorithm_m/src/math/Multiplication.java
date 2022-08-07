package math;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long result;
        int a, b, c;

        a = sc.nextInt();
        result = a;
        b = sc.nextInt();
        c = sc.nextInt();

        for(int i = 0; i < b; i ++) {
            result *= a;
        }

        result = result % c;

        System.out.println(result);

    }

}
