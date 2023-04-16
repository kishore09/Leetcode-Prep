class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int res = 0;
        while (left < right) {
            int containerLength = right - left;
            int area = containerLength * Math.min(height[left], height[right]);
            res = Math.max(res, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return res;
    }
}



// - - - - - - - - -
// -   TC: O(n)    -
// -   SC: O(1)    -
// - - - - - - - - -


// TC: This is because the function iterates over the array once using two pointers, and the number of iterations is proportional to the number of elements in the array. 