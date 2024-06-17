import java.util.*;
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int a1[]=new int[a];
		int a2[]=new int[b];
		for(int i=0;i<a;i++)
		{
			a1[i]=sc.nextInt();
		}
		for(int i=0;i<b;i++)
		{
			a2[i]=sc.nextInt();
		}
		int a3[]= {a1[1],a2[1]};
		
		for(int i=0;i<2;i++)
		{
		   System.out.println(a3[i]);
		}
	}

}
