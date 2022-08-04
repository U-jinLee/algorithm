package string;

import java.util.*;

public class WordSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        Set<String> set = new HashSet<>();

        for(int i = 0; i < length; i++) {
            set.add(sc.next());
        }

        String[] arr = set.toArray(new String[0]);
        Arrays.sort(arr);
        Arrays.sort(arr, Comparator.comparing(String::length));

        for (String s : arr) {
            System.out.println(s);
        }
    }
}
