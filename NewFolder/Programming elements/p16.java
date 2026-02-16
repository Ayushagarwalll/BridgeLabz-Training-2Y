import java.util.*;
public class p16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,q,r;
        a=sc.nextInt();
        b=sc.nextInt();
        q=a/b;
        r=a%b;
        System.out.println("The Quotient is"+q+"and remainder is"+r+"of two numbers"+a+"and"+b);
        sc.close();
    }
    
}
