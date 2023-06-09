class Solution {
    // Input: nums = [100,4,200,1,3,2]
    // Output: 4

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int ans = 1;
        for (int num : nums) set.add(num);
        for (int num : nums) {
            // no left neighbour = new set so check right
            if (!set.contains(num - 1)) {
                int count = 1;
                while (set.contains(num + 1)) {
                    // adding 1 as it is consicutive 
                    num++;
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}



// ***** REREAD THE TC AND SC *****

// - - - - - - - - -
// -   TC: O(n)    -
// -   SC: O(n)    -
// - - - - - - - - -


// Time complexity:

// Adding each element to the HashSet takes O(n) time, where n is the length of the input array nums.
// The outer loop iterates n times.
// The inner loop (while loop) can iterate at most n times in total for all iterations of the outer loop. This is because, in the worst case, it will iterate through all distinct elements of nums, which is n elements.
// Therefore, the total time complexity is O(n).

// Space complexity:

// The HashSet will store at most n distinct elements from the input array nums. Thus, the space complexity is O(n).