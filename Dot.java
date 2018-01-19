import java.util.*;
import java.lang.*;
import java.io.*;


class Dot
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try{
		
			String stl=sc.next();
			stl=stl+'.';
			System.out.println(stl);
		}
		catch(Exception e){
		System.out.println("Invalid Input");
		}
	}
}
