public class BuyAndSellStocks {
    public static int stocks(int arr[]){
        int buyprice = Integer.MAX_VALUE;
        int MaxProfit =0;
        for(int i =0; i<arr.length; i++){
            if(buyprice < arr[i]){
                int profit = arr[i] - buyprice;
                MaxProfit =Math.max(MaxProfit , profit); // OverallProfit , dayProfit
            }else{
                buyprice =arr[i];

            }
        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int arr[] ={7, 1, 5, 3, 6, 4};
        System.out.println("MaxProfit : "+stocks(arr));
    }
}
