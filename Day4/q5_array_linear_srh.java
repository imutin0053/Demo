import java.util.Scanner;
public class q5_array_linear_srh{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("Enter no. to search: ");
        int key=input.nextInt();
        for(int i=0;i<n;i++){
            if(key==arr[i]){
                System.out.print(key+" found at index: "+i);
                break;
            }
            else System.out.println("Element is not in the array");
        }
    }
}