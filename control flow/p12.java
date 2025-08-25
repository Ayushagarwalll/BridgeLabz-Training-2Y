import java.util.*;
public class p12
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,sum1=0;
        n=sc.nextInt();
        if(n>0){
            int t=n;
        while(n>0)
        {
            sum1+=n;
            --n;
        }
        int sum2=(t*(t+1))/2;
        if(sum1==sum2)
        System.out.print("the result is same i.e."+sum1);
        }
        else
        System.out.println("not a natural no.");
    }}