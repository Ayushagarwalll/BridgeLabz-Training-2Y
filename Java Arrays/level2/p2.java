import java.util.*;
public class p2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int height[]=new int[3];
        int age[]=new int[3];
        int i,y=0,gh=0;
        for(i=0;i<3;i++)
        {
            height[i]=sc.nextInt();
            age[i]=sc.nextInt();
        }
        gh=height[0];
        y=age[0];

         for(i=0;i<3;i++)
        {
            if(gh<height[i])
            gh=height[i];
            if(y>age[i])
            y=age[i];
            
        }
        System.out.println("youngest="+y);
        System.out.println("tallest="+gh);
    }}
        