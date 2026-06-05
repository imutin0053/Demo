import java.util.Scanner;
public class q2_array_sum_avg{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        float avg= (float)sum/n;
        System.out.println("Sum: "+sum+"\nAverage: "+avg);
    }
}