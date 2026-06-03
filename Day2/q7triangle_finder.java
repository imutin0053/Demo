import java.util.Scanner;
public class q7triangle_finder{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Enter 1st Side: ");
        int a1=input.nextInt();
        System.out.print("Enter 2nd Side: ");
        int a2=input.nextInt();
        System.out.print("Enter 3rd Side: ");
        int a3=input.nextInt();
        if((a1==a2 && a1!=a3)||(a2==a1 && a2!=a3)||(a3==a2 && a3!=a1)){
            System.out.println("Isosceles Triangle");
        }else if(a1==a2 && a2==a3){
            System.out.println("Equilateral triangle");
        }else{
            System.out.println("Scalene triangle");

        }
    }
}