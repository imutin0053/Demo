import java.util.Scanner;
public class q4pallinno{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=input.nextInt();
        int rev = reverse(num);
        if(num==rev){
            System.out.println("Pallindrome Number");
        }else{
            System.out.println("Not a pallindrome Number");
        }
    }
    public static int reverse(int num){
        int num1=num;
        int res=0;
        while(num1!=0){
            int rem=num1%10;
            res=(res*10)+rem;
            num1/=10;
        }
        return res;
    }  
}