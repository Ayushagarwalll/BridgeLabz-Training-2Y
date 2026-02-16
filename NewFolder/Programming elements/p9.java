import java.util.*;
public class p9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int fee,d,damo,dfee;
         fee=sc.nextInt();
         d=sc.nextInt();
        damo=(fee*d)/100;
        dfee=fee-damo;
        System.out.println("The discount amount is INR"+damo+"and final discounted fee is INR"+dfee);
        sc.close();
    }
    }
    

