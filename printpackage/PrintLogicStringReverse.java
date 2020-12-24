package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
public class PrintLogicStringReverse
{
	public void printReverseString()
	{
	int i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the string input:");
	String s= sc.nextLine();	
	char[] arr=new char[s.length()];
	for (i=0;i<s.length();i++ ) 
	{
		arr[i]= s.charAt(i);
	}
	System.out.println("the reverse of string is:");
	for (j=s.length()-1;j>=0 ;j-- ) 
	{
		System.out.println(arr[j]);
	}
}
}