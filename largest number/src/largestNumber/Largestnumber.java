package largestNumber;
import java.util.*;
public class Largestnumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter array size:" );
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.print("Enter array elements:");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	int largest=a[0];
	for(int i=0;i<n;i++)
	{
		if(largest<a[i])
		{
			largest=a[i];
		}
		}
	System.out.print("largest element= "+ largest );
	}

	}		// TODO Auto-generated method stub

