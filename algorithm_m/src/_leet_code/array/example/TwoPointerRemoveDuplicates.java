package _leet_code.array.example;

public class TwoPointerRemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums == null) return 0;

        int writerPointer = 1;

        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if(nums[readPointer] != nums[readPointer - 1]) {
                nums[writerPointer] = nums[readPointer];
                writerPointer++;
            }
        }
        return writerPointer;
    }
}