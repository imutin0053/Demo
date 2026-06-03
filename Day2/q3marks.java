import java.util.Scanner;
public class q3marks{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Enter Maths marks: ");
        int m1=input.nextInt();
        System.out.print("Enter DSA marks: ");
        int m2=input.nextInt();
        System.out.print("Enter Physics marks: ");
        int m3=input.nextInt();
        System.out.print("Enter Electrical marks: ");
        int m4=input.nextInt();
        System.out.print("Enter C marks: ");
        int m5=input.nextInt();
        float per=((float)(m1+m2+m3+m4+m5)/500)*100;
        if(per>=90){
            System.out.println("Grade: A");
        }else if(per>=80 && per<90){
            System.out.println("Grade: B");

        }else if(per>=70 && per<80){
            System.out.println("Grade: C");
        }
        else if(per>=60 && per<70){
            System.out.println("Grade: D");
        }else{
            System.out.println("FAIL");
        }
    }
}