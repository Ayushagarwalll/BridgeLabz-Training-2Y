import java.util.*;
public class p6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[11],sum=0,i;
        for(i=0;i<211;i++)
        {
        arr[i]=sc.nextInt();
        sum+=arr[i];
    }
    System.out.println(sum/11);
    }}