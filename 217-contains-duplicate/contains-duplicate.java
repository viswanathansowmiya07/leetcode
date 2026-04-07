class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        int index = 0;

        for(int i =1;i<nums.length;i++){
            if(nums[index]==nums[i]){
                return true;
            }
            index++;
        }
       return false; 
    }
}