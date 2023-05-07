class Solution {
    public int[] twoSum(int[] nums, int target) {

        // to store 2 nums = tar
       HashMap<Integer,Integer> memo = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        // complement
           int complement = target-nums[i];
           if(memo.containsKey(complement)){
               return new int[]{memo.get(complement),i};
           }
           memo.put(nums[i],i);
       }
       throw new IllegalArgumentException("No Two Sum Found");
    }
}


// - - - - - - - - -
// -   TC: O(n)    -
// -   SC: O(n)    -
// - - - - - - - - -