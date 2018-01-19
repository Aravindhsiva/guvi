import java.util.*;
import java.lang.*;
import java.io.*;
class Reverse
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s==(String)s){
		char[] ch=s.toCharArray();
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		System.out.print(ch[i]);
		System.out.println();
		}
		else
		{
		System.out.println("Invalid input");
		}
	}
}
/*Hardwork never fails*/
