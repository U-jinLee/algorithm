package _leet_code.arrayNstring.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayAndString {
    public static void main(String[] args) {
        List<Integer> v0 = new ArrayList<>();
        List<Integer> v1;

        Integer[] a = {0, 1, 2, 3, 4};
        v1= new ArrayList<>(Arrays.asList(a));
        List<Integer> v2 = new ArrayList<>(v1);

        System.out.println(v1.size());
        System.out.println(v1.get(0));
        System.out.print("[Version 1] The contents of v1 are:");
        for (int i = 0; i < v0.size(); ++i) {
            System.out.print(" " + v1.get(i));
        }
        System.out.println("");
        System.out.print("[Version 2] The contents of v1 are:");
        for (Integer item : v0) {
            System.out.print(" " + item);
        }
        System.out.println();
        // 6. modify element
        v1.set(0, 5);       // modify v2 will actually modify v1
        System.out.println("The first element in v1 is: " + v1.get(0));
        v2.set(0, -1);
        System.out.println("The first element in v1 is: " + v2.get(0));
        // 7. sort
        Collections.sort(v1);
        // 8. add new element at the end of the vector
        v1.add(-1);
        v1.add(1, 6);
        // 9. delete the last element
        v1.remove(v1.size() - 1);
    }
}
