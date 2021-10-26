package programmers.level1;

public class getArrayAvg {

	public static double solution(int[] arr) {
		int arrLength = arr.length;
		double sum= 0;
		
		for(int i = 0; i<arrLength; i++) {
			sum += arr[i];
		}
		double answer = sum / arrLength;
		return answer;
	}

}
