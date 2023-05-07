class Solution {
    // Input: s = "ABAB", k = 2
    // Output: 4
    // Explanation: Replace the two 'A's with two 'B's or vice versa.

    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int ans = 0;
        int max = 0;
        int i = 0;
        // sliding window using i and j 
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            // creating a frequency array 
            arr[s.charAt(j) - 'A']++;
            // finding the max freq char in that array and adding it to maxcount 
            max = Math.max(max, arr[ch - 'A']);
            // checking if the ans(sliding window - max freq char)=how many char you need to change usig k is > k 
            // move left pointer of sliding window and decrement the fre in arr
            if (j - i + 1 - max > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            // updating the window size after all this in ans 
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}


// - - - - - - - - -
// -   TC: O(n)  -
// -   SC: O(1)  -
// - - - - - - - - -


// for SC: In summary, both O(1) and O(26) are correct notations for the space complexity of this algorithm, but O(1) is more commonly used in practice.