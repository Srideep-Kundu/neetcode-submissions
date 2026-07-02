class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size();
        unordered_map<int, int> mpp;
        for(int i = 0; i < n; i++){
            mpp[nums[i]] = i;
        }
        for(int i = 0; i < n; i++){
            int diff = target - nums[i];
            if(mpp.find(diff) != mpp.end() && mpp.find(diff)->second != i){
                auto it = mpp.find(diff);
                return {i, it->second};
            }
        }
        return {};
    }
};
