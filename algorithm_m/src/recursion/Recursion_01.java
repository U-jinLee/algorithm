package recursion;

public class Recursion_01 {
	public static void main(String[] args) {
		/*무한 루프에 빠져버린다.*/
		recursiveExam1();
		/*적당히 무한으로 즐긴다.*/
		recursiveExam2(4);
		/*활용해 보자*/
		recursiveExam3(4);
	}
	
	public static void recursiveExam1() {
		System.out.println("HelloWorld");
		recursiveExam1();
	}
	
	public static void recursiveExam2(int n) {
		/*baseCase:적어도 하나의 recursion에 빠지지 않는 경우가 존재*/
		if(n <= 0) {
			return;
		}else {
			System.out.println("Hello");
			/*recursiveCase:recursion이 반복하다 보면
			 *결국 baseCase에 수렴해야 된다.*/
			recursiveExam2(n-1);
		}
	}
	
	public static int recursiveExam3(int n) {
		if(n==0) {
			return 0;
		}else {
			return n + recursiveExam3(n-1);
		}
	}
}