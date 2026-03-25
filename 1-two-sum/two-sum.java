class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> output = new HashMap<>();
        int out[] = new int [2];
        int value =0;
        for(int i=0;i<nums.length;i++){
            value = target - nums[i];
            if(output.containsKey(value)){
                out[0]=i;
                out[1]=output.get(value);
                return out;
            }
            output.put(nums[i],i);
        }
        return out;
    }
}