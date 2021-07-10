#include <iostream>
using namespace std;

int partition(int arr[],int low, int high){
    int pivot = arr[high];
    int i = low-1;

    for(int j=low;j<high;j++){
        if(arr[j]<pivot){
            i++;

            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
        }
    }
    int temp = arr[high];
        arr[high]= arr[i+1];
        arr[i+1]= temp;
    return i+1;

}

void quicksort(int arr[],int low, int high){
    if(low<high){
        int pi = partition(arr,low,high);

        quicksort(arr,low,pi-1);
        quicksort(arr,pi+1,high);
    }
}

int main() {
	//code
	int i;
	int arr[i];
	cin>>i;
	for(int j=0; j<i;j++){
	    cin>>arr[j];
	}

	
	
	return 0;
}