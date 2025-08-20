import java.util.*;
public class p15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int up,u,tp;
        up=sc.nextInt();
        u=sc.nextInt();
        tp=up*u;
        System.out.println("The total price is INR"+tp+"if the quantity"+u+"and unit price is INR "+up);
        sc.close();
    }
    
}
