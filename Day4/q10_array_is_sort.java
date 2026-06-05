import java.util.Scanner;
public class q10_array_is_sort{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int issort=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                issort=0;
                break;
            }
        }
        if(issort==0) System.out.println("Array is not sorted");
        else System.out.println("Array is sorted");
    }
}