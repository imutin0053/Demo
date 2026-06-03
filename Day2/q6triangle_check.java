import java.util.Scanner;
public class q6triangle_check{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Enter 1st angle: ");
        int a1=input.nextInt();
        System.out.print("Enter 2nd angle: ");
        int a2=input.nextInt();
        System.out.print("Enter 3rd angle: ");
        int a3=input.nextInt();
        if(a1+a2+a3>180){
            System.out.println("Not a valid Triangle");
        }else{
            System.out.println("Valid triangle");

        } 
    }
}