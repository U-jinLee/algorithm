package _leet_code;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        //배열의 끝까지 반복함
        for(int i = 0; i < nums.length; i++){
            // i번째 수의 배열과 i의 다음 배열인 j의 수를 더한다.
            for(int j = i+1; j < nums.length; j++) {
                //만약 nums target과 같다면 두개의 수를 배열에 추가한다.
                if(nums[i] + nums[j] == target) {result[0] = i; result[1] = j;}
            }
        }

        return result;
    }

}
