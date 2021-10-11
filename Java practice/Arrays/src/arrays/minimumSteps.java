package arrays;
import java.util.*;

public class minimumSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n;i++) {
			arr[i] = sc.nextInt();
			 
		}
		
		int S = sc.nextInt();
		int D = sc.nextInt();
		
		System.out.println(calcStep(arr,S,D));

	}
	
	public static int calcStep(int[] A, int S, int D) {
		
		int count=0;
		while(S!=D) {
			int diff=S-D;
			if(diff>0) {
				int minNum = binaryDiff(A,diff);
				S = S-minNum;
				count++;
			}else {
				int minNum = binaryDiff(A,diff);
				S = S+minNum;
				count++;
			}
			
		}
		
		return count;
	}
	
	public static int binaryDiff(int[] arr, int num) {
		int start = 0;
		int end = arr.length-1;
		int mid = start - (end-start)/2;
		Arrays.sort(arr);
		while(start<end) {
			if(arr[mid]==num) {
				return num;
			}else if(arr[mid]<num) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return arr[mid];
	}

}
