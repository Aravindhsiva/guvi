import java.util.*;
import java.lang.*;
import java.io.*;
class Roman
{
	public int valueRoman(char ch)
	{
		int value=0;
	//	System.out.println(ch);
		switch(ch)
		{
			case 'I':value=1;break;
			case 'V':value=5;break;
			case 'C':value=100;break;
			case 'X':value=10;break;
			case 'D':value=500;break;
			case 'L':value=50;break;
			case 'M':value=1000;break;
			default:value=-1;
		}
	//	System.out.println(value);
		return(value);
	}
	
	public static void main (String[] args)
	{
	//	static int I=1,V=5,X=10,L=50,C=100,D=500,M=1000;
		int sum=0,i;
		Scanner sc=new Scanner(System.in);
		try{
		
		Roman ad=new Roman();
			String st=sc.next();
			char[] s=st.toCharArray();
			int l=st.length();
			
			for( i=l-1;i>0;i--)
			{
			if(ad.valueRoman(s[i])==-1)
			{
			sum=-1;
			break;
			}
				if(i>0 && i+1<l&& s[i]!=s[i-1] && ad.valueRoman(s[i])>ad.valueRoman(s[i-1]) && s[i-1]==s[i+1])
				{
					sum=-1;
					break;
				}
				else if(s[i]!=s[i-1] && ad.valueRoman(s[i])>ad.valueRoman(s[i-1]) && (s[i-1]=='I'||s[i-1]=='X'||s[i-1]=='C'))
				{
					if((s[i]=='C'||s[i]=='D'||s[i]=='M') && s[i-1]=='I')
					{
						sum=-1;
						break;
					}
					if((s[i]=='D'||s[i]=='M') && s[i-1]=='X')
					{
						sum=-1;
						break;
					}
					sum+=ad.valueRoman(s[i])-ad.valueRoman(s[i-1]);
					i--;
					//System.out.println(sum+","+i);
					
				}
				else if(s[i]!=s[i-1] && ad.valueRoman(s[i])>ad.valueRoman(s[i-1]) && (s[i-1]!='I' && s[i-1]!='X'&&s[i-1]!='C'))
				{
					sum=-1;
					break;
				}
				else
				{
					sum+=ad.valueRoman(s[i]);
					//System.out.println(sum+","+i);
				}
			}
			if(sum==-1)
			System.out.println("Invalid Input");
			else
			{
				if(i==0)
				sum+=ad.valueRoman(s[0]);
			System.out.println(sum);
			}
		}
		catch(Exception e){
		System.out.println("Invalid Input");
		}
	}
}
