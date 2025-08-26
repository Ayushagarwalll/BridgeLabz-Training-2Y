import java.util.*;
public class p17
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double s,y,b=0;
        s=sc.nextInt();
        y=sc.nextInt();
        if(y>5)
        b=s*0.05;
        System.out.print("bonus="+b);
    }
}
