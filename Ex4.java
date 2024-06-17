import java.util.*; 
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sise");
		int a=sc.nextInt();
		int asci[]=new int[a];
		System.out.println("Enter the ascii values");
	
		for(int i=0;i<a;i++)
		{
			asci[i]=sc.nextInt();
		}
		
        for (int asciiValue : asci) {
            char character = (char) asciiValue;
            System.out.print(character);
        }
        System.out.println();

	}

}
