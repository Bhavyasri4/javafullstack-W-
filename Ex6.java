import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter the array values");
	
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
        Arrays.sort(arr);
        for(int i=0;i<a;i++)
        {
        	System.out.println(arr[i]);
        }
	}

}
