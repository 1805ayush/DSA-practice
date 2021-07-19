#include <iostream>;
#include <bits/stdc++.h>
using namespace std;

int kthSmallest(int arr[], int l, int r, int k) {
        //code here
        priority_queue<int> q;
        
        for(int i=l;i<=r;i++){
            q.push(arr[i]);
            
            if(q.size()>k){
                q.pop();
            }
        }
        
        return q.top();
        
        
    }