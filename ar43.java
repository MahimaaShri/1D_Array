import java.util.Scanner;
public class ar43 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean f=false;
        for(int i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>n/2)
            {
                System.out.println(arr[i]);
                f=true;
                break;
            }
        }
        if(!f)
        {
            System.out.println("No majority element");
        }
    }
}
