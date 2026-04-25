public class SubArray1{
    public int returnSubArray(int arr[],int k){
        int n =arr.length;
        if(n<k){
            return -1;
        }
        int i=0;
        
        int windowsum=0;
        while(i<k){
            windowsum+=arr[i];
            i++;
        }
        int maxsum=windowsum;
        
        while(i<n){
            windowsum=windowsum+arr[i]-arr[i-k];
            maxsum = Math.max(maxsum, windowsum);
            i++;
        }
        
        return maxsum;
    }
   public static void main(String args[]){
       SubArray1 m=new SubArray1();
       int a[]={1,3,3,5,8,9};
       System.out.println(m.returnSubArray(a,3));
   } 
}
