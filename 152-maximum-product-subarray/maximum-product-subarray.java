class Solution {
    public int maxProduct(int[] nums) {

        int product =0;
        int maxSubValue = Integer.MIN_VALUE;

        for(int i =0;i<nums.length;i++){
            product = nums[i];
            maxSubValue = Math.max(product,maxSubValue);
            for(int j =(i+1);j<nums.length;j++){
                product = product *nums[j];
               maxSubValue = Math.max(maxSubValue,product); 
            }
        }
        return maxSubValue;
    }
}