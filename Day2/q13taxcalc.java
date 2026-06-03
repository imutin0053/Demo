import java.util.Scanner;
public class q13taxcalc{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Income: ");
        float in=input.nextFloat();
        if(in<250000){
            System.out.println("No tax!");
        } else if(in>=250000 && in<500000){
            float tax= 0.05f*in;
            System.out.printf("Tax: Rs%.2f",tax);
        }else if(in>=500000 && in<1000000){
            float tax= 0.2f*in;
            System.out.printf("Tax: Rs%.2f",tax);
        }else {
            float tax= 0.3f*in;
            System.out.printf("Tax: Rs%.2f",tax);
        }
    }
}