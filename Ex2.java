import java.util.*;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
           
            int max = array[0];
    int min = array[0]; 
    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
        if (array[i] < min) {
            min = array[i];
        }
    }
    System.out.println("Maximum value: " + max);
    System.out.println("Minimum value: " + min);

	}

}
