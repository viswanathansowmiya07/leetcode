class Solution {
    public int removeDuplicates(int[] nums) {
      Map<Integer,Integer>out = new LinkedHashMap<>();
      for(int i=0;i<nums.length;i++){
        out.put(nums[i],1);
      }
      int index =0;
      for(Map.Entry<Integer,Integer>entry:out.entrySet()){
        nums[index]=entry.getKey();
        index++;
      }
      return out.size();
    }
}