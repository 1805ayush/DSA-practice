class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int count0=0;
        int count1=0;
        int count2=0;
        
        for(int i=0; i<n;i++){
            switch(a[i]){
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }
        
        for(int j=0;j<count0;j++){
            a[j]=0;
        }
         for(int j=count0;j<count1+count0;j++){
            a[j]=1;
        }
        for(int j=count1+count0;j<n;j++){
            a[j]=2;
        }
    }
}