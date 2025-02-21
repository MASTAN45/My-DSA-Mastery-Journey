

public class MaxSubArray {
    public static int maxSum(int arr[]){
        int countsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int n = arr.length;
        int prefix [] = new int[n];
        prefix[0] = arr[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
            for(int start=0; start<n; start++){
                for(int end = 1; end<n; end++ ){
                    // Using Prefix Sum
                    countsum = start ==0 ? prefix[end] : prefix[end] - prefix[start -1];
                
                // for(int k =i; k<=j; k++){          // O(n3)
                //     countsum +=arr[k];
                // 
                    if(maxsum <countsum){
                    maxsum = countsum;
                    }
                }

            }

        return maxsum;


    }
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6 ,-1, 3};
        System.out.println("Maxsum : "+maxSum(arr));
    }

    
}
