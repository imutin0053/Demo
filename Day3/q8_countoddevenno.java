import java.util.Scanner;
public class q8_countoddevenno{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=input.nextInt();
        int num1=num;
        int o=0,e=0;
        while(num1!=0){
            int rem=num1%10;
            if(rem%2==0){
                e++;
            }else{
                o++;
            }
            num1/=10;
        }
        System.out.printf("Odd nos.: %d\nEven nos.: %d\n",o,e);
    }
}