

public class MinSubArray {

    public int minSubArray(int a[]){
        int i=1;
        int currentsum =a[0];
        int minsum=a[0];
        while(i<a.length){
            currentsum =Math.min(a[i],currentsum+a[i]);
            minsum =Math.min(minsum,currentsum);
            i++;
        }
        return minsum;

    }

    public static void main(String args[]){
        MinSubArray b =new MinSubArray();
         int[] arr = {3, -4, 2, -3, -1, 7, -5};
        System.out.println(b.minSubArray(arr));
    }
    
}
