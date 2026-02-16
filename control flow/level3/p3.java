import java.util.*;
public class p3
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int p,c,m,avg;
        char g='.';
        p=sc.nextInt();
        c=sc.nextInt();
        m=sc.nextInt();
        avg=(p+c+m)/3;
        if (avg>=80)
        g='A';
        else if(avg<=79&&avg>=70)
        g='B';
        else if(avg<=69&&avg>=60)
        g='C';
        else if(avg<=59&&avg>=50)
        g='D';
        else if(avg<=49&&avg>=40)
        g='E';
        else if(avg<=39)
        g='R';
        System.out.print(g);
    }
}
