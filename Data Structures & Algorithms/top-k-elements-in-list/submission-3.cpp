class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int, int> freq;
        for(int ele : nums){
            freq[ele]++;
        }
        
        vector<pair<int,int>> keys;

        for(auto it : freq){
            keys.push_back({it.second, it.first});
        }

        sort(keys.begin(), keys.end());
        
        vector<int> ans;
        int i = keys.size() - 1;
        while(k--){
            ans.push_back(keys[i--].second);
        }

        return ans;
    }
};
