import java.util.*;
public class p7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int odd[]=new int[n/2+1];
        int even[]=new int[n/2+1];
        int c=0,d=0;    
        for(int i=0;i<=n;i++)
        {
            if((i+1)%2==0)
            even[c++]=i+1;
            else
            odd[d++]=i+1;
        }
        System.out.print("odd ");
        for(int i=0;i<c;i++)
        { System.out.print(odd[i]+" ");
    }System.out.println("");
    System.out.print("even ");
    for(int i=0;i<d;i++)
        {System.out.print(even[i]+" ");
}}}