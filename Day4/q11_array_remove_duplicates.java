import java.util.Scanner;
public class q11_array_remove_duplicates{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter total no. of elements: ");
        int n=input.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=n-1;j>i;j--){
                if(arr[i]==arr[j]){
                    for(int k=j;k<n-1;k++){
                        arr[k]=arr[k+1];
                    }
                    n--;
                }
            }
        }
        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}