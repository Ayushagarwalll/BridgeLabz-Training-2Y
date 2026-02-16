import java.util.*;
public class p9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=2,c=2,d=0;
        int [][]arr=new int[r][c];
        int []a=new int[r*c];
        int i,j;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                a[d++]=arr[i][j];
            }
        }
        for(i=0;i<c*r;i++)
        {
            System.out.println(a[i]);
        }
    }}