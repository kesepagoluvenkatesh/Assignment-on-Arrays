package arrays;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:" );
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.print("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			b[j]=sc.nextInt();
		}
		System.out.print("sum of array elements ");
		for(int k=0;k<n;k++) 
		{
			System.out.print(a[k]+b[k]+" ");
		}
	}
}