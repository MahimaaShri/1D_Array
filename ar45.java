import java.util.Scanner;
public class ar45{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }boolean f=true;
        for(int i=0;i<n/2;i++)
        {
            if(arr[i]!=arr[n-i-1])
            {
                f=false;
                break;
            }
        }
        if(f){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}