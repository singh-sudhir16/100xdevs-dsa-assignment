#include<bits/stdc++.h>
using namespace std;

bool checkSubarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> m;
        m[0] = -1;
        int sum = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (m.find(sum % k) != m.end()) {
                if (i - m[sum % k] >= 2)
                    return true;
            }
            else
                m[sum % k] = i;
        }

        return false;
    }

int main(){

  int t;
  cin>>t;
  while(t--){
    int n;
    cin>>n;
    vector<int> vec(n);
    for(int i=0;i<n;i++)
      cin>>vec[i];
    int k;
    cin>>k;
    cout<<checkSubarraySum(vec,k)<<"\n";
  }
}
