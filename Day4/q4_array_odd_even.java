import java.util.Scanner;
public class q4_array_odd_even{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int o=0,e=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0) e++;
            else o++;
        }
        System.out.println("Odd: "+o+"\nEven: "+e);
    }
}