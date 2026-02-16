import java.util.*;
public class p2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>0)
            {
                System.out.println("Positive no.");
                if(arr[i]%2==0)
                System.out.println("Even");
                else
                System.out.println("Odd");
                 }
            else if(arr[i]<0)
            System.out.println("Negative no.");
            else
            System.out.println("Zero");
        }
        if(arr[0]==arr[4])
         System.out.println("they are equal");
         else if(arr[0]>arr[4])
          System.out.println("First one is greater");
          else 
           System.out.println("last one is greater");
    }}