package programmers.level1;
import java.util.*;
public class Integer {

	public static void main(String[] args) {
		Long [] arr2 = {3L, 4L, 1L ,2L, 6L};
		ArrayList<Long> array = new ArrayList<>();
		long n = 118372;
		String answer = "";
		
		while(n != 0) {
			array.add(n % 10);
			n /= 10;
		}
		
		Arrays.sort(arr2, Collections.reverseOrder());
		for(int i=0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		for(Long size : array) {
			answer += size;
		}
		
	}

}
