package math;

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNum = 0;
        int result = 0;
        int[] studentNum = new int[5];
        for(int i = 0 ; i < 5; i++) {
            int testResult = studentNum[i] = sc.nextInt();
            totalNum += avgOrHighNum(testResult);
        }
        result = totalNum / 5;
        System.out.println(result);
    }

    private static int avgOrHighNum(int testNum) {
        if(testNum < 40) {
            return 40;
        } else {
            return testNum;
        }
    }

}