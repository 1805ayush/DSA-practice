#include <bits/stdc++.h>
using namespace std;
void rotate(int arr[], int n)
{
 int solution[n];
    int t=0;
    for(int i =n-1;i<= n-1;i++){
        solution[t]=arr[i];
        t++;
    }
    for(int i =0;i<=n-2;i++){
        solution[t]=arr[i];
        t++;
    }
    int s=0;
    for(int x: solution){
        arr[s]=x;
        s++;
    }
}