import java.util.*;
public class p6
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,d=0;
        n=sc.nextInt();
        while(n!=0)
        {
            d++;
            n=n/10;
        }
        System.out.println(d);
    }}