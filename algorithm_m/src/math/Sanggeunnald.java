package math;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Sanggeunnald {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int[] burgers = new int[3];
        int[] beverage = new int[2];

        for(int i = 0 ; i < burgers.length; i++) burgers[i] = scanner.nextInt();
        for(int i = 0 ; i < beverage.length; i++) beverage[i] = scanner.nextInt();

        System.out.println(calculateCheapestSetMenu(burgers, beverage));

    }

    public static int calculateCheapestSetMenu(int[] burgers, int[] beverages) {
        return Arrays.stream(burgers).min().getAsInt() + Arrays.stream(beverages).min().getAsInt() - 50;
    }
}
