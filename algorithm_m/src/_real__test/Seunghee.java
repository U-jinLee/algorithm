package _real__test;

import java.util.Arrays;

public class Seunghee {
    public static void main(String[] args) {
        int [] a = {3, 2, 3, 4};
        int f = 2;
        int m = 4;

        int [] a2 = {1, 5, 6};
        int f2 = 4;
        int m2 = 3;

        int [] a3 = {1, 2, 3 ,4};
        int f3 = 4;
        int m3 = 6;

        int [] a4 = {6, 1};
        int f4 = 1;
        int m4 = 1;


        for (int i : solution(a, f, m)) {
            System.out.println(i);
        }
        System.out.println();
        for (int i : solution(a2, f2, m2)) {
            System.out.println(i);
        }
        System.out.println();
        for (int i : solution(a3, f3, m3)) {
            System.out.println(i);
        }
        System.out.println();
        for (int i : solution(a4, f4, m4)) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] a, int f, int m) {
        int totalCount = a.length + f;
        int totalValue = m * totalCount;

        int minusValue = 0;
        for (int i : a) {
            minusValue += i;
        }

        int calValue = totalValue - minusValue;
        int avgValue = calValue / f;

        if(avgValue > 6 || avgValue < 0) {
            int[] result = {0};
            return result;
        }

        int[] result = new int[f];

        for(int i = 0; i < result.length; i++) {
            result[i] = avgValue;
        }

        if(Arrays.stream(result).sum() == calValue) {
            return result;
        }else {
            int namujisu = calValue - Arrays.stream(result).sum();
            while (namujisu != 0) {
                for(int i = 0; i <result.length; i++) {
                    if(namujisu == 0) continue;
                    result[0] += 1;
                    namujisu --;
                }
            }
        }

            return result;
        }

}
