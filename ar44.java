import java.util.Scanner;
public class ar44{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            boolean f=true;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<=arr[j])
                {
                    f=false;
                    break;
                }
            }
            if(f)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
