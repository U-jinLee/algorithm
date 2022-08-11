package math;

import java.util.Scanner;

public class Receipt_5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long totalPrice = sc.nextLong();
        long[] books = new long[9];

        for(int i = 0; i <books.length; i++) {
            books[i] = sc.nextLong();
        }

        System.out.println(calculateOneBookPrice(totalPrice, books));
    }

    public static long calculateOneBookPrice(long totalPrice, long[] books) {
        for(int i = 0; i < books.length; i++) {
            totalPrice -= books[i];
        }
        return totalPrice;
    }
}
