import java.util.*;
public class ar3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        sum[0]=arr[0];
        for(int i=1;i<n;i++){
           sum[i]=arr[i]+sum[i-1];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(sum[i]+" ");
        }
        
    }
}

