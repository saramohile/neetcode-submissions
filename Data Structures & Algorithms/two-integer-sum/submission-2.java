class Solution {
    public int[] twoSum(int[] nums, int target) {
        //using hashing
        Map<Integer, Integer> m = new HashMap<>();
        int arr[] = new int[2];
        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            int b = target - a;
            if(!m.containsKey(b)){
                m.put(a,i);
            }
            else{
                arr[0]= m.get(b);
                arr[1]= i;
                Arrays.sort(arr);
            }
        }
    
        return arr;
    }
}
