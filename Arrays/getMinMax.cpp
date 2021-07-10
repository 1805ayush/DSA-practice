#include <iostream>
using namespace std;

int partition(long long arr[],int low, int high){
    long long pivot = arr[high];
    int i = low-1;

    for(int j=low;j<high;j++){
        if(arr[j]<pivot){
            i++;

            long long temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
        }
    }
    long long temp = arr[high];
        arr[high]= arr[i+1];
        arr[i+1]= temp;
    return i+1;

}

void quicksort(long long arr[],int low, int high){
    if(low<high){
        int pi = partition(arr,low,high);

        quicksort(arr,low,pi-1);
        quicksort(arr,pi+1,high);
    }
}
pair<long long, long long> getMinMax(long long a[], int n) {
    
    pair<long long , long long> pp;
    quicksort(a,0,n-1);
    pp.first = a[0];
    pp.second = a[n-1];
    
    return pp;
    
    
    
}
