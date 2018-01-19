import java.util.*;
import java.lang.*;
import java.io.*;
class Swap
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try{
			String s;
			s=sc.next();
			int l=s.length();
			char[] a=new char[l];
			a=s.toCharArray();
			for(int i=1;i<l;i=i+2)
			{
				char temp;
				temp=a[i];
				a[i]=a[i-1];
				a[i-1]=temp;
			}
			s=String.valueOf(a);
			System.out.println(s);
		}
		catch(Exception e){
		System.out.println("Invalid Input");
		}
	}
}
/*Hard work never fails*/
