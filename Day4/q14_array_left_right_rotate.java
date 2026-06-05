import java.util.Scanner;
public class q14_array_left_right_rotate{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int l,r;
        System.out.print("Enter no. of times to left rotate: ");
        l=input.nextInt();
        leftrotate(arr, n, l);
        System.out.print("\nEnter no. of times to right rotate: ");
        r=input.nextInt();
        rightrotate(arr, n, r);
        
    }
    public static void leftrotate(int[] arr,int size,int k){
        int a=0;
        while(a!=k){
            int temp=arr[0];
            for(int i=0;i<size-1;i++){
                arr[i]=arr[i+1];
            }
            arr[size-1]=temp;
            a++;
        }
        System.out.print("After left rotate the array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rightrotate(int[] arr,int size,int k){
        int a=0;
        while(a!=k){
            int temp=arr[size-1];
            for(int i=size-1;i>0;i--){
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
            a++;
        }
        System.out.print("After right rotate the array: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}