import java.util.Scanner;
public class ar33{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int low=0,hig=n-1;
        while(low<=hig){
            int mid=(low+hig)/2;
            if(arr[mid]==target)
            {
                System.err.println(mid);
                return;
            }
            if(arr[mid]<target)
                low=mid+1;
            else
                hig=mid-1;
        }
        System.out.println(-1);
    }
}