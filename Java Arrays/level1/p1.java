import java.util.*;
public class p1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int []age=new int[10];
        for (int i=0;i<10;i++)
        {
            age[i]=sc.nextInt();
            if (age[i]>0)
            {
                if(age[i]>18)
                System.out.println("Can vote");
                else
                System.out.println("Can not vote");
            }
            else
            System.out.println("invalid input");
        }
    }
}
