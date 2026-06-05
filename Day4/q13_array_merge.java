import java.util.Scanner;
public class q13_array_merge{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements of 1st arrray: ");
        int a1=input.nextInt();
        int[] arr1=new int[a1];
        System.out.print("Enter total no. of elements of 2nd arrray: ");
        int a2=input.nextInt();
        int[] arr2=new int[a2];
        System.out.print("Enter elements of 1st array: ");
        for(int i=0;i<a1;i++){
            arr1[i]=input.nextInt();
        }
        System.out.print("Enter elements of 2nd array: ");
        for(int i=0;i<a2;i++){
            arr2[i]=input.nextInt();
        }
        int a3=a1+a2;
        int[] arr3=new int[a3];
        for(int i=0;i<a1;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<a2;i++){
            arr3[a1++]=arr2[i];
        }
        System.out.print("Final merged array: ");
        for(int i=0;i<a3;i++){
            System.out.print(arr3[i]+" ");
        }
    }
}