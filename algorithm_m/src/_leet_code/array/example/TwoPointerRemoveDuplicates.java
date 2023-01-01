package _leet_code.array.example;

public class TwoPointerRemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums == null) return 0;

        int writerPointer = 1;
        // 순차 배열을 통해서 진행 writerPointer와 readPointer의 순서를 맞추는 것이 중요
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            //조건부 검색(앞 뒤 값이 다를 시 현재 위치에 값을 넣고 write 포인트 뒤로 당기기)
            if(nums[readPointer] != nums[readPointer - 1]) {
                nums[writerPointer] = nums[readPointer];
                writerPointer++;
            }
        }
        return writerPointer;
    }
}