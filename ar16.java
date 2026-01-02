import java.util.*;
public class ar16{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean f=true;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1])
            {
                f=false;
                break;
            }
        }
        if(f)
            System.out.println("sorted in descending");
        else
            System.out.println("unsorted in descending");
    }
}
