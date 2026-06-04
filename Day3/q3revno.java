import java.util.Scanner;
public class q3revno{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=input.nextInt();
        int num1=num;
        int res=0;
        while(num1!=0){
            int rem=num1%10;
            res=(res*10)+rem;
            num1/=10;
        }
        System.out.println(res);
    }
}