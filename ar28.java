import java.util.Scanner;
public class ar28{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++){
            int re=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    re++;                    
                }
            }
            if(re==1)
                System.out.println(re);
                return;
        }
    }
}