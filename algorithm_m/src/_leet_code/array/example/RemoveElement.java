package _leet_code.array.example;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        removeElement(nums, val);
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        removeElement(nums2, val2);
    }

    public static int removeElement(int[] nums, int val) {
        int[] result = new int[nums.length];
        int length = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
            } else {
                nums[length] = nums[i];
                length++;
            }
        }

        return length;
    }
}
