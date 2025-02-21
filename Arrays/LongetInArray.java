public class LongetInArray {
    public static int longest(int arr[]){
        int longest = Integer.MIN_VALUE;
        for(int i= 0; i<=arr.length-1; i++){
            if(longest < arr[i]){
                longest = arr[i];
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 3,5};
        System.out.println("Longest Num : "+longest(arr));
    }
}
