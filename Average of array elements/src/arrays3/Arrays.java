package arrays3;
import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int n=sc.nextInt();
		int count=0;
		float sum=0;
		int a[]=new int[n];
		System.out.print("enter values:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		//System.out.print("sum of array elements:"+ a[i]);
		}
		for(int i=0;i<n;i++)
		{
			count++;
			sum=sum+a[i];
		}
		float avg=sum/count;
		System.out.print("The average of numbers:"+avg);

	}

}
