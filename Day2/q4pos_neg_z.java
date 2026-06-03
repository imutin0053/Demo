import java.util.Scanner;
public class q4pos_neg_z{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Enter number: ");
        int f=input.nextInt();
        if(f>0){
            System.out.println("Positive number");
        }else if(f<0){
            System.out.println("Negative number");
        }else{
            System.out.println("Zero");

        } 
    }
}