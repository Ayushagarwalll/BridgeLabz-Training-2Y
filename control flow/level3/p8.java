import java.util.*;
public class p8
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,sum=0,d;
        n=sc.nextInt();
        for(int i =1;i<n;i++)
        {
            if(n%i==0)
            sum+=i;
        }
        if (sum>n)
        System.out.println("Abundant no.");
        else
        System.out.println("not a Abundant no.");

        }
}

