import java.util.*;
public class p1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double sal[]=new double[10];
        int y[]=new int[10];
        double nsal[]=new double[10];
        double bonus[]=new double[10];
        int i;
        double b=0,tb=0,tns=0,tos=0;
        for(i=0;i<10;i++)
        {
            sal[i]=sc.nextDouble();
            y[i]=sc.nextInt();
            if(y[i]<=0||sal[i]<0){
            System.out.println("re-enter");
            i--;}
        }

        for(i=0;i<10;i++)
        {
            if(y[i]>=5)
            b=5;
            else
            b=2;
            bonus[i]=sal[i]*0.5;
            nsal[i]=sal[i]+bonus[i];
            tb+=bonus[i];
            tos+=sal[i];
            tns+=nsal[i];
        }
        
        for (i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + 
                               " | Old Salary: " + sal[i] +
                               " | Bonus: " + bonus[i] +
                               " | New Salary: " + nsal[i]);
        }

        System.out.println("\nTotal Bonus Payout: " + tb);
        System.out.println("Total Old Salary: " + tos);
        System.out.println("Total New Salary: " + tns);
    }}

