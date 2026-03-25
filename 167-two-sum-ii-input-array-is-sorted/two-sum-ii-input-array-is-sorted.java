class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer>output = new HashMap<>();
        int [] out = new int[2];
        int value =0;
        for(int i=0;i<numbers.length;i++){
            value = target - numbers[i];
            if(output.containsKey(value)){
                out[0] = output.get(value);
                out[1] = i+1;
                return out;
            }
            output.put(numbers[i],(i+1));
        }
        return out;
    }
}