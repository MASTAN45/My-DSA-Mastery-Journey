public class BinarySearch {
    public static int binarySearch ( int arr[], int key){
        int start =0, end = arr.length-1;
        int mid =0;
        while(start <= end){
            mid = (start+ end)/2;
        // campare
            if(arr[mid] == key){
                return mid;
            }if(arr[mid]>key){ // should be in Beetween  while loop 
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={2, 4, 6, 8, 10, 12, 14};
        int key = 25;
        System.out.println("Mid value is : "+binarySearch(arr, key));
    }
    
    
}
