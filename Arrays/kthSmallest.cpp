#include <iostream>
using namespace std;


class Solution{
    public:
    // arr : given array
    // l : starting index of the array i.e 0
    // r : ending index of the array i.e size-1
    // k : find kth smallest element and return using this 
    
    int partition(int arr[],int low, int high){
        int pivot = arr[high];
        int i = low;
    
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
              
    
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
            }
        }
        int temp = arr[high];
            arr[high]= arr[i];
            arr[i]= temp;
        return i;

    }

    int randomPartition(int arr[],int low, int high){
        int n =high - low+1;
        int pivot =rand()%n;
        int temp = arr[pivot+1];
        arr[pivot+1] = arr[high];
        arr[high] = temp;
        return partition(arr,low, high);
        
    }
    int kthSmallest(int arr[], int l, int r, int k) {
        //code here
        if(k>0&&k<=r-l+k){
            int pos = randomPartition(arr,l,r);
            
            if(pos-1==k-1){
                return arr[pos];
            }
            if(pos-1>k-1){
                return kthSmallest(arr,l,pos-1,k);
            }
            return kthSmallest(arr,pos+1,r,k-pos+l-1);
        }
        
        
    }
};