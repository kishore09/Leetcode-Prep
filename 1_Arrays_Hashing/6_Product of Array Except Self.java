class Solution {
    public int[] productExceptSelf(int[] nums) {

      int result [] = new int [nums.length];
        int runningProduct = 1;

        // find prefix
        for(int i = 0; i < nums.length; i++){

            result[i] = runningProduct;
            runningProduct = runningProduct * nums[i];
        }

        // find postfix using ptr and multiply it with res
        runningProduct = 1;
        for(int i = nums.length -1 ; i >= 0; i--){

            result[i] = result[i] * runningProduct;
            runningProduct = runningProduct * nums[i];
        }
        return result;  
    }
}

// - - - - - - - - -
// -   TC: O(n)    -
// -   SC: O(1)    -
// - - - - - - - - -

// In this case, since the additional array output is required for the solution, it should not be considered as extra space used. So, if we do not count the output array as additional space, then the space complexity is indeed O(1), 