public class Hallow_rectangle{
    public static void rectangle(int tot_rows, int tot_cols){
        for(int i =1; i<=tot_rows; i++){
            for(int j=1; j<=tot_cols; j++){
                if(i==1 || i==tot_rows || j==1 || j==tot_cols){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        rectangle(4,5);

    }
}