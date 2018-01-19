import java.util.*;
import java.lang.*;
import java.io.*;
class Factorial
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try{
		long n=sc.nextInt();
		if(n==(long)n){
		long m=n;
		for(int i=2;i<m;i++)
		n=n*i;
		System.out.println(n);
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
