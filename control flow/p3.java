import java.util.*;
public class p3
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n1,n2,n3,g;
        n1=sc.nextInt();
       n2=sc.nextInt();
       n3=sc.nextInt();
       if(n1>n2&&n1>n3)
       g=n1;
       else if(n2>n3)
       g=n2;
       else
       g=n3;
       System.out.println(g);

    }}