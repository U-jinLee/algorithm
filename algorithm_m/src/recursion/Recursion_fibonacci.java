package recursion;

import java.util.Scanner;

public class Recursion_fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(pibonacci(x));
	}
	
	public static int pibonacci(int argX) {
		int x = argX;
		if(x<=1) {
			return x;
		}else {
			return pibonacci(x-2)+pibonacci(x-1);
		}
		
	}

}
