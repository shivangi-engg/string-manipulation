package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
public class PrintLogicVowelsCount
{
	public void printVowelsCount()
	{
		int count,i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string input:");
		String s= sc.nextLine();
		count = 0;
		char[] arr= new char[s.length()];
		for (i=0;i<s.length() ;i++ ) 
		{
			arr[i]= s.charAt(i);
		}
		for (char j:arr) 
		{
			switch(j)
			{
				case 'a':
					count=count+1;
					break;
				case 'e':
					count=count+1;
					break;
				case 'i':
					count=count+1;
					break;
				case 'o':
					count=count+1;
					break;
				case 'u':
					count=count+1;
					break;
				case 'A':
					count=count+1;
					break;
				case 'E':
					count=count+1;
					break;
				case 'I':
					count=count+1;
					break;
				case 'O':
					count=count+1;
					break;
				case 'U':
					count=count+1;
					break;
					default:
					break;
			}			
			
		}
		System.out.println("the no. of vowels is:"+count);
	}
}