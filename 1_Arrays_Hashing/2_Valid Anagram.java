class Solution {
    public boolean isAnagram(String s, String t) {
        // diff len != same text
        if (s.length() != t.length()) {
            return false;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count the frequency of each character in s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        
        // Check if the frequency of each character in t matches the frequency in s
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            // if t char is != map key 
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }
            // if present reduce 1
            map.put(c, map.get(c) - 1);
        }
        
        return true;
    }
}


// - - - - - - - - -
// -   TC: O(n)    -
// -   SC: O(k)    -
// - - - - - - - - -


// If the length of the strings s and t are not equal, the function returns false immediately without performing any further computation. This means that the time complexity in this case would be O(1),

// The space complexity of the code is O(k), where k is the number of unique characters in the strings s and t. In the worst-case scenario, when all characters in the strings are unique, the HashMap will have to store frequency counts for each of the k characters. Therefore, the space complexity is O(k).