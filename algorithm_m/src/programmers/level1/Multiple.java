package programmers.level1;

public class Multiple {
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++){
          answer[i] = x * i + x;
        }
        
        return answer;
    }
}