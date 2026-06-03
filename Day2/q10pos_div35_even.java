import java.util.Scanner;
public class q10pos_div35_even{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Enter no.: ");
        int num=input.nextInt();
        if(num>0 && num%2==0 && num%3==0 && num%5==0){
            System.out.println("The number is positive and even and divisible by 3 and 5.");
        } else {
            System.out.println("The number does not meet the criteria.");
        }
    
    }
}