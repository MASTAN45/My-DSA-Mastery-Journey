public class TrappingOfRainWater {
    public static int trappingWater(int arr[]) {
        int n =arr.length;
        int trappingWater = 0;

        //LeftMax 

        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for(int i=1; i<n; i++){
            leftmax[i] =Math.max(leftmax[i-1] ,arr[i]);
        }
        // right Max
        int rightmax [] = new int[n];
        rightmax[n-1] = arr[n-1];
        for(int i = n-2; i>=0 ; i--){
            rightmax[i] =Math.max(rightmax[i+1] , arr[i]);
        }
        for(int i =0 ;i<n; i++){
            int waterlevel = Math.min(rightmax[i], leftmax[i]);

        
        trappingWater += waterlevel - arr[i];
        }
        return trappingWater;



        
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6,3, 2, 5};
        System.out.println("TrappingWater : "+trappingWater(arr));
    }
}
