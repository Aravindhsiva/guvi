import java.util.*;
import java.lang.*;
import java.io.*;
class rev
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try{
		long n=sc.nextInt();
		if(n==(long)n){
		long s=0;
		long l=n%10;
		while(n>0)
		{
			s=s*10+n%10;
			n=n/10;
		}
		if(l==0)
		System.out.print('0');
		System.out.println(s);
		}
		else
		{
		System.out.println("Invalid Input");
		}
		}
		catch(Exception e){
		System.out.println("Invalid Input");
		}
	}
}
