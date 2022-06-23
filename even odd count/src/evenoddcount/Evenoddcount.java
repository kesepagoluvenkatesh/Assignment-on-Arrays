package evenoddcount;
import java.util.*;
public class Evenoddcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size:" );
		int n=sc.nextInt();
		int a[]=new int[n];
		int evencount=0;
		int Oddcount=0;
		System.out.print("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0)
		{
			evencount++;
		}else
			Oddcount++;
		}
		System.out.println("Even count= "+evencount);
		System.out.print("Odd count= "+Oddcount);

	}

}
