import java.util.Scanner;
public class square_cube{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=input.nextInt();
        System.out.printf("Square: %d\n",num*num);
        System.out.printf("Cube: %d\n",num*num*num);
    }
}