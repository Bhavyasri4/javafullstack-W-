import java.util.*;
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter the ascii values");
	
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
        Arrays.sort(arr);
        System.out.println(arr[1] );
        System.out.println(arr[arr.length - 2] );
    }
	
		

	}


