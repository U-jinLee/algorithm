package programmers.level1;

public class OddAndEven {
    public static String solution(int num) {
        String answer = (num % 2 == 1) || (num % 2 == -1)? "Odd":"Even"; 
        return answer;
    }
    
    public static void main(String[] args) {
    	System.out.println(solution(-3));
    }
}
