package _leet_code.array.example;

public class SearchArray {
    public static void main(String[] args) {
        int[] array = new int[6];
        int length = 0;

        for(int i = 0; i < 6; i++) {
            array[length++] = i;
        }

        System.out.println(linearSearch(array, length, 4));
        System.out.println(linearSearch(array, length, 30));
    }

    public static boolean linearSearch(int[] array, int length, int element) {
        if(array == null || length == 0) {
            return false;
        }

        for(int i = 0; i < length; i++) {
            if(array[i] == element) return true;
        }

        return false;
    }

}
