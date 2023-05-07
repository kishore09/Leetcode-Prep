import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> unq = new HashSet<>();

        for(int ele:nums){
            // If present in HM then duplicate
            if(unq.contains(ele)){
                return true;
            }
            else{
                // every entry should be unique
                unq.add(ele);
            }
        }
        return false;
    }
}


// - - - - - - - - -
// -   TC: O(n)    -
// -   SC: O(n)    -
// - - - - - - - - -




