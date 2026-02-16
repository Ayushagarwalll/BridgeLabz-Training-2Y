import java.util.*;
public class p2
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int y,c=0;
        y=sc.nextInt();
        if(y>=1582)
        {
            if(y%4==0&&y%100==0){
                c=0;
                if(y%400==0)
                c=1;
            }
            if(c==1)
            System.out.println("Leap year");
            else
            System.out.println("not a leap year");
        }
        else
        System.out.println("out of range");
    }

        }