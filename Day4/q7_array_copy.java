import java.util.Scanner;
public class q7_array_copy{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int[] cpy=new int[n];
        for(int i=0;i<n;i++){
            cpy[i]=arr[i];
        }
        System.out.print("Copied array: ");
        for(int i=0;i<n;i++){
            System.out.print(cpy[i]+" ");
        }
    }
}