package _leet_code.array.example;

public class DuplicateRemover {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int writePointer = 1;

        for(int readPointer = 1 ; readPointer < nums.length; readPointer++) {
            if(nums[readPointer] != nums[readPointer-1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }

        return writePointer;
    }
}
