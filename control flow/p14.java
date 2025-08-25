import java.util.*;
public class p14
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,f=1;
        n=sc.nextInt();
        while(n!=0)
        {
            f*=n;
            n--;
        }
        System.out.println("the factorial is"+f);
    }}