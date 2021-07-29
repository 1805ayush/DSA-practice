#include <bit/stdc++.h>
using namespace std;

int doUnion(int a[], int n, int b[], int m)  {
        //code here 
        int count=0;
        int t=0;
        int i=0;
        int j=0;
        while(i<n && j<m){
                if(a[i]==b[j]){
                    count++;
                    i++;
                    j++;
                }else if(a[i]<b[j]){
                    i++;
                }else if(a[i]>b[j]){
                    j++;
                }
    
            }
            
        
        return m+n-count;
    }
};