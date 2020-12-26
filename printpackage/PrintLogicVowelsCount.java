package printpackage;
import java.io.*;
import java.lang.*;
import java.util.*;
public class PrintLogicVowelsCount
{
	public void printVowelsCount()
	{
		int count,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string input:");
		String s= sc.nextLine();
		count = 0;
		char[] arr_vowels = {'a','e','i','o','u','A','E','I','O','U'};
		for (i=0;i<s.length() ;i++ ) 
		{
			char a= s.charAt(i);
			for (j=0;j<10 ;j++ ) 
			{
				char b= arr_vowels[j];
				if (a == b) 
				{	
					count++;
						
				}	
			}
		}
		System.out.println("the no. of vowels is:"+count);
		
		
	}
}