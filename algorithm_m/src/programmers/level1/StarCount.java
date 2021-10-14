package programmers.level1;
import java.util.*;

public class StarCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        
        for(int i= 0; i < m; i++) {
        	for(int j=0; j<n; j++) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }
    }
}
