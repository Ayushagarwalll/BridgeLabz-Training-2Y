import java.util.*;
public class p7
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int d,m;
        d=sc.nextInt();
        m=sc.nextInt();
       if((m==3&&d>=20)||(m==6&&d<=20)||(m>3&&m<6))
       System.out.println("Spring season");
       else
       System.out.println("not a Spring season");
    }}