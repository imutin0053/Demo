import java.util.Scanner;
public class largest_oftwo{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter 1st no: ");
        int num1=input.nextInt();
        System.out.print("Enter 2nd no: ");
        int num2=input.nextInt();
        if(num1>num2){
            System.out.println(num1+" is greater");
        }else{
            System.out.println(num2+" is greater");
        }
    }
}