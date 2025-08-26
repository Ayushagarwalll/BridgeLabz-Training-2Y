import java.util.*;
public class p7
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,t,sum=0,d;
        n=sc.nextInt();
        t=n;
        while(n!=0)
        {
            d=n%10;
            sum+=d;
            n=n/10;
        }
        if (t%sum==0)
        System.out.println("Harshad no.");
        else
        System.out.println("Not a harshad no.");

        }
}

