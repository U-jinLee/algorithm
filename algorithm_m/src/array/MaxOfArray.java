package array;

import java.util.Scanner;

public class MaxOfArray {
	
	static int maxOf(int[] num) {
		int max = num[0];
		for(int i = 0; i < num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}			
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자의 최댓값을 구합니다.");
		
	}
	
}
