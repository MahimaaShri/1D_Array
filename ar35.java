import java.util.*;
class ar35{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int b[]=new int[n2];
        for(int i=0;i<n2;i++)
        {
            b[i]=sc.nextInt();
        }
        int i=0,j=0,k=0;
        int c[]=new int[n1+n2];
        while(i<n1 && j<n2)
        {
            if(a[i]<b[j])
                c[k++]=a[i++];
            else
                c[k++]=b[j++];
        }
        while(i<n1){
            c[k++]=a[i++];
        }
        while(j<n2)
        {
            c[k++]=b[j++];
        }
        int s=n1+n2;
        for(int m=0;m<s;m++)
        {
            System.out.print(c[m]+" ");
        }
    }
}
