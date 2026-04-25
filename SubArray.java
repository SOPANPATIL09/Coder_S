public class SubArray{
    
    public int returnMaxSum(int arr[]){
        
        int i=1;
        int maxsum=arr[0];
        int currentsum=arr[0];
        while(i<arr.length){
            currentsum=Math.max(arr[i],arr[i]+currentsum);
            maxsum =Math.max(maxsum,currentsum);
            i++;
        }
        return maxsum;
    }
    public static void main(String args[]){
        SubArray s =new SubArray();
        int a[]={1,2,2,5,32,5,56,5,6};
        System.out.println(s.returnMaxSum(a));
    }
}