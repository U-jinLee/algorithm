package programmers.level1;

import java.util.Scanner;
public class WaterMelon {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		String waterMelon = "수박";
		int n = sc.nextInt();
		String str = "";
		
		for(int i =0; i<n; i++) {
			if(i%2==0) {
				str += waterMelon.charAt(0);				
			} else if(i%2==1) {				
				str += (waterMelon.charAt(1));
			}
		}
		System.out.println(str);
	}
}
