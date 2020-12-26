package printpackage;
import java.util.*;
import java.io.*;
import java.lang.*;
public class PrintLogicWordCount
{
	public void printWordCount()
	{
		int i,j;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string to check the no. of words");
		String s1 = sc.nextLine();
		String s = s1.trim();
		for (i=0;i<s.length() ;i++ ) 
		{
			char c = s.charAt(i);
			int a = c;
			if (a == 32) 
			{
				count++;		 		
		 	} 	
		}
		count++;
		System.out.println("the number of words in given string are:"+count);
		
	}
}
