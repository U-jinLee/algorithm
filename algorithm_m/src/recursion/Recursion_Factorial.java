package recursion;
import java.util.*;
/*recursion을 이용한 팩토리얼 함수*/
public class Recursion_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾으려는 숫자 입력:");
		int x = sc.nextInt();
		sc.close();
		System.out.println(recursion(x));
	}
	
	public static int recursion(int argX) {
		int x = argX;
        
		if(x == 1) {
			return 1; 
		}else {			
			return x * recursion(x-1);
		}
	}	
}
