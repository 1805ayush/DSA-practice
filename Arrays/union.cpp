#include <bit/stdc++.h>
using namespace std;

int doUnion(int a[], int n, int b[], int m)  {
        //code here 
        int count=0;
        int t=0;
        int i=0;
        int j=0;
        if(m>n){
            while(t<m){
                if(a[i]==b[j]){
                    count++;
                }else if(a[i]<b[j]){
                    i++;
                }else if(a[i]>b[j]){
                    j++;
                }
                t++;
            }
            
        }else{
            while(t<n){
                if(a[i]==b[j]){
                    count++;
                }else if(a[i]<b[j]){
                    i++;
                }else if(a[i]>b[j]){
                    j++;
                }
                t++;
            }
        }
        
        count=m+n-count;
        return count;
    }
}