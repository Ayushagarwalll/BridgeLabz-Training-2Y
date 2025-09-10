import java.util.*;
public class p1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1,str2;
        int i;
        boolean b=true;
        str1=sc.next();
        str2=sc.next();
        int l1,l2;
        if(str1.length()!=str2.length())
        b=false;
        else
        {
            for(i=0;i<str1.length();i++)
            {
                if(str1.charAt(i)!=str2.charAt(i))
                b=false;
        }
            }
System.out.println("result using charAt "+b);
System.out.println("result using equal "+str1.equals(str2));
    }}
