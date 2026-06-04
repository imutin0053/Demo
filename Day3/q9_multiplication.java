import java.util.Scanner;
public class q9_multiplication{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=input.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n",num,i,num*i);
        }
    }
}