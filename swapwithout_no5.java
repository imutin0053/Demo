import java.util.Scanner;
public class swapwithout_no5{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter 1st no.: ");
        int num1=input.nextInt();
        System.out.print("Enter 2nd no.: ");
        int num2=input.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.printf("1st no. now: %d\n",num1);
        System.out.printf("2nd no. now: %d\n",num2);
    }
}