import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
     public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        ArrayList[] bucket = new ArrayList[nums.length+1]; // <- +1 cuz we are storing freq in index and if freq = 3 then 0,1,2 is nums.length so +1 = 0,1,2,3 for [1,1,1]

        // Making a frequency HashMap
        for (int num : nums)
        if (!count.containsKey(num)) {
            count.put(num, 1);
        } else {
            count.put(num, count.get(num) + 1);
        }
        
        // looping through the keys and index of bucket <- freq and data = value
        for (int key : count.keySet()){
            int freq = count.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }
        
        // In reverse check and add the values in res array
        int index = 0;
        int[] res = new int[k];
        for (int i = nums.length; i >= 0; i--){
            if (bucket[i] != null){
                for (int val : bucket[i]){
                    res[index] = val;
                    index++;
                    if(index == k)
                        return res;
                }
            }
        } 
        return res;
    }

    

// - - - - - - - - -
// -   TC: O(n)    -
// -   SC: O(n)    -
// - - - - - - - - -






































