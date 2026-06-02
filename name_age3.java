import java.util.Scanner;
public class name_age3{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter Your name: ");
        String name=input.nextLine();
        System.out.print("Enter Your age: ");
        int age=input.nextInt();
        System.out.printf("Name: %s\n",name);
        System.out.printf("Age: %d\n",age);
    }
}