class Solution {
    public int removeElement(int[] nums, int val) {
        int index = nums.length -1;
        int swap =  nums.length -1;
        int output =0;
        for(int i = index ; i >=0;i--){

            if(nums[i] == val){
                int temp = nums[i];
                nums[i] = nums[swap];
                nums[swap]=temp;
                swap--;
            }else{
                output++;
            }
        }
        return output;
    }
}