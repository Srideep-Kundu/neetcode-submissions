class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int zeroCount = 0;
        for(int ele : nums){
            if(ele != 0) prod *= ele;
            else zeroCount++;
        }
        
        int n = nums.length;
        
        int[] ans = new int[n];
        if(zeroCount == n) return ans;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0 && zeroCount != 0){
                ans[i] = 0;
            }
            else if(nums[i] == 0 && zeroCount > 1){
                ans[i] = 0;
            }
            else if(nums[i] == 0 && zeroCount == 1){
                ans[i] = prod;
            }
            else if(nums[i] != 0 && zeroCount == 0){
                ans[i] = prod / nums[i];
            }
        }

        return ans;
    }
}  
