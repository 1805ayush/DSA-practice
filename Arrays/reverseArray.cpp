#include <iostream>
using namespace std;

void reverse(int arr[],int start,int end){
    while(start<end){
    arr[start] = arr[start]+arr[end];
    arr[end] = arr[start]-arr[end];
    arr[start]= arr[start]-arr[end];
    start++;
    end--;
    }
}

void print(int arr[],int n){
    for(int j=0; j<n;j++){
	   cout<<arr[j]<<" ";
  }
}

int main() {
	//code
	int n;
	
	cin>>n;
 	while(n>0){
	    
	    int i;
	    int arr[i];
	    cin>>i;
	    for(int j=0; j<i;j++){
	        cin>>arr[j];
	    }
	    reverse(arr,0,i-1);
	    
	    print(arr,i);
	    n--;
	}
	
	return 0;
}