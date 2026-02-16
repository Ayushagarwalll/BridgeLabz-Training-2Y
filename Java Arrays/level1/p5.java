import java.util.*;
public class p5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        int n=sc.nextInt();
        for(int i=0;i<4;i++){
            arr[i]=n*(i+6);
        }
        for(int i=0;i<4;i++)
        System.out.println(n+"*"+(i+6)+"="+arr[i]);
    }
}