package array;

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
		
	}
	
}
