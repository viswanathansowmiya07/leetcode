class Solution {
    public int removeDuplicates(int[] nums) {

        int targetValue = nums[0];
        int index = 1;
        int output =1;
        for(int i =1;i<nums.length;i++){
            if(nums[i] == (targetValue+1)||(targetValue < nums[i])){
                targetValue = nums[i];
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index]=temp;
                index++;
                output++;
            }
        }
        return output;
    }
}