import java.util.Scanner;
public class q11calc{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        while(true){
            System.out.print("Enter 1st no.: ");
            float num1=input.nextFloat();
            System.out.print("Enter 2nd no.: ");
            float num2=input.nextFloat();
            System.out.print("Enter Operator(+,-,*,/,%): ");
            char c=input.next().charAt(0);
            if(c=='+'){
                System.out.printf("Sum: %.2f\n",num1+num2);
            }else if(c=='-'){
                System.out.printf("Subtraction: %.2f\n",num1+num2);
            }else if(c=='*'){
                System.out.printf("Multiplication: %.2f\n",num1*num2);
            }else if(c=='/'){
                float d= num1/(int)num2;
                System.out.printf("Division: %.2f\n",d);
            }else if(c=='%'){
                int r= (int)num1%(int)num2;
                System.out.printf("Remainder: %d\n",r);
            }else{
                System.out.println("Invalid input!");
            }
            System.out.print("Do you want to continue? (1 or 0): ");
            int ch=input.nextInt();
            if(ch==1){
                continue;
            }else if(ch==0){
                System.out.println("Exitting...");
                break;
            }else {
                System.out.println("Invalid Choice!");
            }
        }
    }
}