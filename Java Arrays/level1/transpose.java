import java.util.*;
public class transpose
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[5][5];
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
            }
        }
            for( i=0;i<5;i++){
            for( j=0;j<5;j++){
                System.out.print(arr[i][j]);
            }System.out.println();

        }int tem=0;
         for(i=0;i<5;i++){
            for( j=i+1;j<5;j++){
                tem=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tem;
            }
         }
         System.out.println();

         for( i=0;i<5;i++){
            for( j=0;j<5;j++){
                System.out.print(arr[i][j]);
            }System.out.println();

        }
    }}