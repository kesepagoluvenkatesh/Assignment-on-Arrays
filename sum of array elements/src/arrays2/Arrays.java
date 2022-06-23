package arrays2;
import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:" );
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		System.out.print("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.print("sum of array elements: "+sum);
		

	}

}

