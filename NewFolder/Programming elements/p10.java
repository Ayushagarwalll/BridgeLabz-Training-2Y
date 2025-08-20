import java.util.*;
public class p10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int h;
        h=sc.nextInt();
        double i=h/2.54;
        double f=i/12;
        i=i%12;
        System.out.println("Your Height in cm is "+h+" while in feet is"+f+ "and inches is"+i);
        sc.close();
    }
}
