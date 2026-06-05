import java.util.Scanner;
public class q8_array_second_largest{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int sec_largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>sec_largest && arr[i]!=max){
                sec_largest=arr[i];
            }
        }
        System.out.println("Second Largest: "+sec_largest);
    }
}