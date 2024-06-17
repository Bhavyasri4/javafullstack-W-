import java.util.*;
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int a[]=new int[s];
		int c=0;
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<s;i++)
		{
			if(a[i]==1||a[i]==4)
				c++;
		}
		if(c==s)
			System.out.println("true");
		else
			System.out.println("false");

	}

}
