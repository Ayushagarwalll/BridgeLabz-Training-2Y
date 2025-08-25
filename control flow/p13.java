import java.util.*;
public class p13
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,sum1=0;
        n=sc.nextInt();
        if(n>0){
            
        while(n>0)
        {
            sum1+=n;
            --n;
        }
        System.out.print("the sum is"+sum1);
        }
        else
        System.out.println("not a natural no.");
    }}