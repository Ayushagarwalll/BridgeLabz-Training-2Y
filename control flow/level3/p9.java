import java.util.*;
public class p9
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        double n1,n2,res=0;
        char op;
        n1=sc.nextInt();
        n2=sc.nextInt();
        op=sc.next().charAt(0);
        switch (op)
        {
            case '+':
            res=n1+n2;
            break;

            case '-':
            res=n1-n2;
            break;

            case '*':
            res=n1*n2;
            break;

            case '/':
            res=n1/n2;
            break;

            default:
                System.out.println("invalid operator");
        }
    System.out.print(res);
    }
}