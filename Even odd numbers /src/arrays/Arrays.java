package arrays;
import java.util.*;
public class Arrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int number =sc.nextInt();
		int a[]=new int[number];
		System.out.print("enter numbers:");
		for(int i=0;i<number;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2==0)
		{
			System.out.println("even "+a[i]);
		}
		else
			System.out.println("odd "+a[i]);

		}
	}

}
