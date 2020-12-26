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
	for (i=s.length()-1;i>=0 ;i-- ) 
	{
		arr[i]= s.charAt(i);
		System.out.println(arr[i]);	
	}
}
}