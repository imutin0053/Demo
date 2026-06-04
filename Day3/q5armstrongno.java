import java.util.Scanner;
public class q5armstrongno{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=input.nextInt();
        int num1=num;
        int sum=0;
        int count=0;
        while(num1!=0){
            int rem=num1%10;
            count++;
            num1/=10;
        }
        num1=num;
        while(num1!=0){
            int rem=num1%10;
            int power=1;
            for(int i=1;i<=count;i++){
                power*=rem;
            }
            sum+=power;
            num1/=10;
        }
        if(sum==num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");

        }
    }
}