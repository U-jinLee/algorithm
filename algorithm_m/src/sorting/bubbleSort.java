package sorting;

import java.util.Scanner;

public class bubbleSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블정렬(오름차순)");
		System.out.println("요솟수 입력:");
		int num = sc.nextInt();
		int [] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.println("x["+i+"]: ");
			x[i] = sc.nextInt();
		}
		
		bubbleSort(x, num);	
		
		System.out.println("오름차순으로 정렬한 값");
		for(int i = 0; i < num; i++) {
			System.out.println("x["+i+"]: "+x[i]);
		}
	}
	
	//버블 정렬
	static void bubbleSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			for(int j = n-1; j > i; j--) {
				if(a[j-1] > a[j]) {
					swap(a, j -1, j);
				}
			}
		}
	}
	
	//숫자를 swap하는 function
	public static void swap(int [] argArray, int index1, int index2) {
		int temp = argArray[index1];
		argArray[index1] = argArray[index2];
		argArray[index2] = temp;
	}
}
