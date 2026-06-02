import java.util.Scanner;
public class arearec{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l=input.nextInt();
        System.out.print("Enter Breadth: ");
        int b=input.nextInt();
        System.out.printf("Area: %d\n",l*b);
        System.out.printf("Perimeter: %d\n",2*(l+b));
    }
}