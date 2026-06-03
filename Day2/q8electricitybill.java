import java.util.Scanner;
public class q8electricitybill{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Units Consumed: ");
        int u=input.nextInt();
        if(u<100){
            System.out.println("Bill: Rs"+u*5);
        }else if(u<200){
            System.out.printf("Bill: Rs%d\n",500+((u-100)*7));
        }else{
            System.out.printf("Bill: Rs%d\n",500+700+((u-200)*10));
        }
    }
}