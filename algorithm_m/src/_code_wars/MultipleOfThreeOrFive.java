package _code_wars;

import java.util.HashSet;
import java.util.Set;

public class MultipleOfThreeOrFive {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }
    public static int solution(int number) {
        Set<Integer> result = new HashSet<>();
        for(int i = 3; i < number; i += 3) result.add(i);
        for(int i = 5; i < number; i += 5) result.add(i);

        return result.stream().mapToInt(Integer::intValue).sum();
    }
}
