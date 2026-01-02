import java.util.Scanner;
public class ar30{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1])
            {
                arr1[j]=arr[i];
                j++;
            }
        }
        arr1[j]=arr[n-1];
        j++;
        for(int i=0;i<j;i++){
            System.out.println(arr1[i]);
        }
    }
}