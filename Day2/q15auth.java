import java.util.Scanner;

public class q15auth{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        String Username="Rockz";
        String Password="RockzDXebec";
        System.out.print("Enter Username: ");
        String user=input.nextLine();
        System.out.print("Enter password: ");
        String pass=input.nextLine();
        if(user.equals(Username) && pass.equals(Password)){
            System.out.println("Success");
        }else if(!user.equals(Username) && pass.equals(Password)) {
            System.out.println("Username may be incorrect!");
        }else if(user.equals(Username) && !user.equals(Password)) {
            System.out.println("Password may be incorrect!");
        }else {
            System.out.println("Both may be incorrect!");
        }   
    }
}