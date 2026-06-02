import java.util.Scanner;
public class pass_fail{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Maths marks: ");
        int num1=input.nextInt();
        System.out.print("Enter DSA marks: ");
        int num2=input.nextInt();
        System.out.print("Enter Physics marks: ");
        int num3=input.nextInt();
        System.out.print("Enter Electrical marks: ");
        int num4=input.nextInt();
        System.out.print("Enter C marks: ");
        int num5=input.nextInt();
        float per=((float)(num1+num2+num3+num4+num5)/500)*100;
        if(per>=40.0){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }
    }
}
