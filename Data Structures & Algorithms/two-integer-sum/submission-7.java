class Solution {
    public int[] twoSum(int[] nums, int target) {
        //using hashing
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            int b = target - a;
            if(m.containsKey(b)){
                return new int[] {m.get(b),i};
            }
            m.put(a,i);
        }
    
        return new int[] {};
    }
}
