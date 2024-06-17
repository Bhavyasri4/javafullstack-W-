import java.util.*;
public class Ex3 {
	int search(int se,int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==se)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		System.out.println("Enter the array elemrnts");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		Scanner sc1=new Scanner(System.in);
		int se=sc1.nextInt();
		Ex3 ob=new Ex3();
		int res=ob.search(se,a);

		System.out.println(res);

	}

}
