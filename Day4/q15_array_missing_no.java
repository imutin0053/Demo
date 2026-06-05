import java.util.Scanner;
public class q15_array_missing_no{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]!=(arr[i+1]-1)){
                System.out.printf("Found missing element: %d",arr[i]+1);
                break;
            }
        }
    }
}