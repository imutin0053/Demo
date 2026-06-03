import java.util.Scanner;
public class q9atm{
    public static void main(String[] args){
        Scanner input= new Scanner (System.in);
        System.out.print("Enter balance: ");
        int bal=input.nextInt();
        if(bal<1000){
            System.out.println("Withdrawl not possible");    
        }else{
            System.out.println("Enter Withdrawl amount: ");  
            int wa=input.nextInt();
            if((bal-wa)<1000){
                System.out.println("Withdrawl not possible");     
            }else{
                System.out.printf("Withdrawl Amount: Rs%d\n",wa); 
                bal-=wa;
                System.out.printf("Balance Remaining: Rs%d\n",bal); 
            }   
        }
    }
}