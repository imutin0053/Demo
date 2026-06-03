import java.util.Scanner;
public class q2leapyear{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Year: ");
        int y=input.nextInt();
        if((y%4==0 && y%100!=0)|| y%400==0){
            System.out.println(y+" is a leap year");
        }else{
            System.out.println(y+" is not a leap year");
        }
    }
}