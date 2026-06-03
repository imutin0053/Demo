import java.util.Scanner;
public class q14roots{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.println("We will use discriminant!");
        System.out.print("Enter a: ");
        int a=input.nextInt();
        System.out.print("Enter b: ");
        int b=input.nextInt();
        System.out.print("Enter c: ");
        int c=input.nextInt();
        float dis=(b*b)-(4*a*c);
        if(dis>0){
            System.out.println("Real and distinct roots");
        }else if(dis==0){
            System.out.println("Real and equal roots");
        }else {
            System.out.println("Imaginary roots");
        }        
    }
}