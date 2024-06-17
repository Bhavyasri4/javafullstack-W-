import java.util.*;
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,n,n6=0,n7=0,sum=0;
	      System.out.println("no of elements:");
	      Scanner s=new Scanner(System.in);
	      n=s.nextInt();
	      int a[]=new int[n];
	      System.out.println("array elements:");
	      for(i=0;i<n;i++) {
	    	  a[i]=s.nextInt();
	      }
	      i=0;

	      while(a[i]!=6&&i<n) {
	          n6++;
	          i++;
	      }
	     
	      j=0;
	      while(a[j]!=7&&j<n) {
	          n7++;
	          j++;
	      }
	      
	      if(n6>n7) {
	      for(i=0;i<n;i++) {
	          if(a[i]!=6||a[i]!=7) {
	                sum=sum+a[i];
	          }
	      }
	      sum=sum;
	   }
	   else {
	       for(i=0;i<n6;i++) {
	             sum=sum+a[i];
	       }
	       for(j=n-1;j>n7;j--) {
	             sum=sum+a[j];
	       }
	   }
	   System.out.println(sum);

	}

}
