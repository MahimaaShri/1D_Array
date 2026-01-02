import java.util.Scanner;
public class ar26{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            sum+=arr[i];
        }
        int rsum=n*(n+1)/2;
        int misnum=rsum-sum;
        System.out.print(misnum);
    }
}
