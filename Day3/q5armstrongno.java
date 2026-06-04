import java.util.Scanner;
public class q5armstrongno{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=input.nextInt();
        int num1=num;
        int sum=0;
        while(num1!=0){
            int rem=num1%10;
            sum+=rem*rem*rem;
            num1/=10;
        }
        if(sum==num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");

        }
    }
}