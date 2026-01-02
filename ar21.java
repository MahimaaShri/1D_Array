import java.util.Scanner;
public class ar21{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min,smin;
        if(arr[0]<arr[1])
        {
            min=arr[0];
            smin=arr[1];
        }
        else
        {
            min=arr[1];
            smin=arr[0];
        }
        for(int i=2;i<n;i++)
        {
            if(arr[i]<min)
            {
                smin=min;
                min=arr[i];
            }
            else if(arr[i]>min && arr[i]<smin)
            {
                smin=arr[i];
            }
        }
        System.out.print(smin);
    }
}