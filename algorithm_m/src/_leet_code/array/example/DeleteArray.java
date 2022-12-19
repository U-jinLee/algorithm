package _leet_code.array.example;

public class DeleteArray {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        int length = defaultDeleteLogic(intArray);
        length = deleteFirstIndexVal(intArray, length);
        deleteWantIndexVal(intArray, length);
    }

    private static void deleteWantIndexVal(int[] intArray, int length) {
        for(int i = 2; i < length; i++) {
            intArray[i - 1] = intArray[i];
        }

        length--;

        for(int i = 0; i < length; i ++) {
            System.out.println("두번 째 값을 지우고 난 후 "+ i + "번 째 인덱스의 값은:" + intArray[i]);
        }
    }

    private static int deleteFirstIndexVal(int[] intArray, int length) {
        for(int i = 1; i < length; i ++) {
            intArray[i - 1] = intArray[i];
        }

        length--;

        for(int i = 0; i < length; i++) {
            System.out.println("첫번 째 값 지우고 난 후 "+ i + "번 째 인덱스의 값은:" + intArray[i]);
        }
        return length;
    }

    private static int defaultDeleteLogic(int[] intArray) {
        int length = 0;

        for(int i = 0; i < 6; i++) {
            intArray[i] = i;
            length++;
        }
        for(int i = 0; i < length; i++) {
            System.out.println(i + "번 째 인덱스의 값은:" + intArray[i]);
        }
        return length;
    }
}
