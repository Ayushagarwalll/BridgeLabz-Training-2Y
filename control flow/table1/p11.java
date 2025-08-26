import java.util.*;
public class p11
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double n=1,sum=0;
        while(true)
        {
             n=sc.nextInt();
             if(n<=0)
             break;
            sum+=n;}
            System.out.println(sum);
        }}