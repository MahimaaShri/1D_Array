import java.util.Scanner;
public class ar20{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max,smax;
        if(arr[0]>arr[1])
        {
            max=arr[0];
            smax=arr[1];
        }
        else
        {
            max=arr[1];
            smax=arr[0];
        }
        for(int i=2;i<n;i++)
        {
            if(arr[i]>max)
            {
                smax=max;
                max=arr[i];
            }
            else if(arr[i]<max && arr[i]>smax)
            {
                smax=arr[i];
            }
        }
        System.out.print(smax);
    }
}