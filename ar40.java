import java.util.*;
class ar40{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int cur=arr[0];
        for(int i=1;i<n;i++)
        {
            if(cur<0)
            {
                cur=arr[i];
            }
            else{
                cur+=arr[i];
            }
            if(cur>max)
            {
                max=cur;
            }
        }
        System.out.print(max);  
    }
}
