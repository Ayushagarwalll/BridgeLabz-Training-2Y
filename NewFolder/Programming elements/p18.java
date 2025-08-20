import java.util.*;
public class p18 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b,c,r1,r2,r3,r4;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        r1=a+b*c;
        r2=a*b+c;
        r3=c+a/b;
        r4=a%b+c;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        sc.close();
    }
    
}
