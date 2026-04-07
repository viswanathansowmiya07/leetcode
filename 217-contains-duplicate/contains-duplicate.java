class Solution {
    public boolean containsDuplicate(int[] nums) {

        Map<Integer,Integer> num = new HashMap<>();
        int value = 0;
        for(int i=0;i<nums.length;i++){
            if(!(num.containsKey(nums[i]))){
                num.put(nums[i],1);
            }else{
                value = num.get(nums[i]);
                value++;
                num.put(nums[i],value);
            }
        }

        for(Map.Entry<Integer,Integer>entry:num.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}