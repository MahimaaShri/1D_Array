import java.util.Scanner;
public class ar27{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int re=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    re=arr[i];
                    break;
                }
            }
            if(re!=-1)
                break;
        }
        if(re!=-1)
        {
            System.out.println(re);
        }
        else{
            System.out.println("not found");
        }
    }
}