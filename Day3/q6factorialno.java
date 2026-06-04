import java.util.Scanner;
public class q6factorialno{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num=input.nextInt();
        int mul=1;
        for(int i=1;i<=num;i++){
            mul*=i;
        }
        System.out.print(num+"! = "+mul);

    }
}