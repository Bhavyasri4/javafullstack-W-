import java.util.*;
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int max=a[0][0];
		int b[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print("a[i][j] ");
			}
			System.out.println("");
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			 b[i][j]=a[r-1-i][c-1-j];
			}
			}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(b[i][j]" ");
			}
			System.out.println("");
		}

	}

}
