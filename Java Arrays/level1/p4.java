import java.util.*;
public class p4
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i=0,n,sum=0;
        int arr[]=new int[10];
        while(true){
            if(i>9)
            break;
            n=sc.nextInt();
            if(n<=0)
            break;
            arr[i]=n;
            sum+=arr[i];
            i++;

        }
        System.out.println(sum);
    }}