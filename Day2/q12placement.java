import java.util.Scanner;
public class q12placement{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Enter CGPA.: ");
        float cg=input.nextFloat();
        System.out.print("Do you have backlogs?(1 or 0): ");
        int bk=input.nextInt();
        System.out.print("Enter Attendence(%): ");
        int at=input.nextInt();
        if(cg>=7.0 && bk==0 && at>=75){
            System.out.println("You are eligible for placement");
        } else {
            System.out.println("Not eligible");
        }
    }
}