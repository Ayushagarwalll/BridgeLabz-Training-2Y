import java.util.*;
public class p4
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>0){
            for(int i=0;i<=n;i++){
            if(n%3==0&&n%5==0)
            System.out.println("FizzBuzz");
            else if(n%5==0)
             System.out.println("buzz");
             else if(n%3==0)
              System.out.println("Fizz");
              else
               System.out.println(n);
               break;
            }
        }else
         System.out.println("not a positive no.");
         }
        }