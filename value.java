import java.io.*;
import java.util.*;
class value{
    public static void main(String arr[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("ENTER THE SIZE OF THE ARRAY");
    int n=scan.nextInt();
    System.out.println("ENTER THE ARRAY ELEMENTS");
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=scan.nextInt();
    }
    int count=0;
    Arrays.sort(a);
    for(int i=0;i<n-1;i++)
		{
			if(a[i]==a[i+1])
			{
			count++;
			}
		}
		if(count==0){
    System.out.println("ENTER THE INDEX VALUE");
    int k=scan.nextInt();
    if(k<n){
        System.out.println("THE VALUE IN THE INDEX "+k+" IS:"+a[k]);
    }else{
        System.out.println("ENTER THE PROPER INDEX VALUE...");
    }}else{System.out.println("ARRAY VALUES ARE NOT UNIQUE..... ENTER UNIQUE VALUES...");}
    }
    
}
