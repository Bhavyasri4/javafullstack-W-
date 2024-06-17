import java.util.*;
public class SumOfEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {10,20,30,40};
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		{
			sum +=numbers[i];
		}
		double avg=(double)sum/numbers.length;
		System.out.println(sum);
		System.out.println(avg);
		

	}

}
