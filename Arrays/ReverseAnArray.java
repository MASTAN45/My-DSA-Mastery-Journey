public class ReverseAnArray {
    public static void reverseArray(int arr[]){
        int start =0, end = arr.length-1;
        while(start<end){
            
            int temp = arr[start];
            arr[start] = arr[end]; // Index arr[start] and arr[end] remember
            arr[end] = temp;
            start++;
            end--;

        } 
    }
    public static void main(String[] args) {
        int arr[] ={2, 4, 6, 8, 10};
        reverseArray(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}