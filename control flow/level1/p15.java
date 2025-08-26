import java.util.*;
public class p15
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n,f=1;
        n=sc.nextInt();
        for(int i=n;n!=0;n--)
            f*=n;           
            System.out.println("the factorial is"+f);
    }}