import java.util.*;
class Solution {
    // Input: strs = ["eat","tea","tan","ate","nat","bat"]
    // Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> memo = new HashMap<>();
        for(String str:strs){
            // freq array with index -> alphabet, value-> freq
            char[] chararr = new char[26];
            for(char c:str.toCharArray()){
                chararr[c-'a']++;
            }
            
            String onesNzerosStr=String.valueOf(chararr);
            if(!memo.containsKey(onesNzerosStr)){
                memo.put(onesNzerosStr,new ArrayList<>());
            }
             memo.get(onesNzerosStr).add(str);
        }
        return new ArrayList<>(memo.values());
    }
}

// - - - - - - - - -
// -   TC: O(n*k)  -
// -   SC: O(n*k)  -
// - - - - - - - - -


// The time complexity of the given code is O(n * k), where n is the number of strings in the input array and k is the length of the longest string. 

// The space complexity of the given code is O(n * k), because the HashMap can store up to n keys, and each key is a string of length k 