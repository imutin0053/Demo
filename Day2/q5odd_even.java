import java.util.Scanner;
public class q5odd_even{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Enter number: ");
        int f=input.nextInt();
        if(f%2==0 && f%5==0){
            System.out.println(f+" is Even number and Divisible by 5");
        }else if (f%2==0 && f%5!=0){
            System.out.println(f+" is Even number and not Divisible by 5");

        }
        else if (f%2!=0 && f%5==0){
            System.out.println(f+" is Odd number and Divisible by 5");
        }else{
            System.out.println(f+" is Odd number and not Divisible by 5");
        }
    }
}