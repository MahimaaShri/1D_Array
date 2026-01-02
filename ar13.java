import java.util.*;
public class ar13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean f=true;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1])
            {
                f=false;
            }
        }
        if(f)
            System.out.println("duplicate");
        else
            System.out.println("not duplicate");
    }
}
