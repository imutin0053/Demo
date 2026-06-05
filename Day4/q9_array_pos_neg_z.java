import java.util.Scanner;
public class q9_array_pos_neg_z{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int pos=0,neg=0,z=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0) pos++;
            else if(arr[i]<0) neg++;
            else z++;
        }
        System.out.println("Positive Elements: "+pos+"\nNegative Elements: "+neg+"\nZeros: "+z);
    }
}