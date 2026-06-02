import java.util.Scanner;
public class arithmatic6{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int num1=input.nextInt();
        System.out.print("Enter 2nd no.: ");
        int num2=input.nextInt();
        System.out.printf("Addition: %d\n",num1+num2);
        System.out.printf("Subtraction: %d\n",num1-num2);
        System.out.printf("Multiplication: %d\n",num1*num2);
        float d= (float)num1/num2;
        System.out.printf("Division: %.2f\n",d);
        System.out.printf("Remainder: %d\n",num1%num2);
    }
}