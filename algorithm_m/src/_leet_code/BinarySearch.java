package _leet_code;

public class BinarySearch {
    public static void main(String[] args) {
        int[] example = {-1,0,3,5,9,12};
        int target = 9;
        int target2 = 2;
        System.out.println(search(example, target));
        System.out.println(search(example, target2));
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int max = nums.length - 1;
        int mid;
        int result = -1;

        while (low <= max) {

            mid = (low + max) / 2;
            if(nums[mid] < target) {
                low = mid + 1;
            }else if(nums[mid] > target) {
                max = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
