import java.util.*;
public class p8
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>0){
            int gf=1;
            for(int i=1;i<n;i++){
            if(n%i==0)
            gf=i;
            }
            System.out.println(gf);
            
        }else
         System.out.println("not a positive no.");
         }
        }