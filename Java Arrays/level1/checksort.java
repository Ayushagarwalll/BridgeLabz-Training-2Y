import java.util.*;
public class checksort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=2,c=2;
        int [][]arr=new int[r][c];
        int i,j;
        boolean b=true;
          for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
            for( i=0;i<r;i++){
            for( j=0;j<c;j++){
                System.out.print(arr[i][j]);
            }System.out.println();
            }

             for( i=0;i<r;i++)
             {
            for( j=0;j<c-1;j++)
            {
                if(arr[i][j]<arr[i][j+1])
                b=true;
                else
                b=false;
                if(i<r-2)
                break;
            }if(arr[i][j]<arr[i+1][0])
            b=true;
            else
            b=false;
             }
             System.out.println(b);
    }}
