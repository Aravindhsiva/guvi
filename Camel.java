import java.util.*;
import java.lang.*;
import java.io.*;
class Camel
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try{
			String s;
			s=sc.nextLine();
			int l=s.length();
			char[] a=new char[l];
			a=s.toCharArray();		
			a[0]=Character.toUpperCase(a[0]);
			for(int i=1;i<l;i=i+2)
			{
				if(a[i]==' ')
				{
				a[i+1]=Character.toUpperCase(a[i+1]);
				}
			}
			s=String.valueOf(a);
			System.out.println(s);
		}
		catch(Exception e){
		System.out.println("Invalid Input");
		}
	}
}
