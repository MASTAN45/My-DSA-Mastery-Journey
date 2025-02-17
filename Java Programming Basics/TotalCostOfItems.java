import java.util.*;
public class TotalCostOfItems {
   public static void main(String[] args) {
       Scanner User = new Scanner(System.in);
       /*float pen = 5.5f;
       float pencil = 4.5f;
       //float eraser = 3.5f;*/
       System.out.print("Enter Cost Of Pen: ");
       float pen = User.nextFloat();
       System.err.print("Enter Cost Of Pencil: ");
       float pencil = User.nextFloat();
       System.out.print("Enter cost of Eraser: ");
       float eraser = User.nextFloat();
       float tax = 0.18f; // with 18% of tax
       float Total = pen+pencil+eraser+tax;

       System.out.println("The Total Bill with tax 18% = "+ Total);
   } 
}
