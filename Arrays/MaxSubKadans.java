public class MaxSubKadans {
    public static int kadans(int arr[]){
        int countsum =0;
        int maxSum = Integer.MIN_VALUE;
        for(int i= 0; i <arr.length; i++){
            countsum += arr[i];
            if(countsum <0){
                countsum =0;
            }
            maxSum= Math.max(maxSum,countsum); // It will take O(n) Time Complexity
        }
        return maxSum;
    }
    public static void main (String args[]){
        int arr [] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("MaxSum: "+kadans(arr));
    }
}