//import package
import printpackage.*;
import java.util.*;
public class Main
{
	//method containnig the logic
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur choice: 1 for vowels_Count, 2 for reverse_String, 3 for  word_count");
		int s= sc.nextInt();
		switch(s)
		{
			case 1:
			printpackage.PrintLogicVowelsCount PrintLogicVowelsCountInstance = new printpackage.PrintLogicVowelsCount();
			PrintLogicVowelsCountInstance.printVowelsCount();
			break;

			case 2:
			printpackage.PrintLogicStringReverse PrintLogicStringReverseInstance = new printpackage.PrintLogicStringReverse();
			PrintLogicStringReverseInstance.printReverseString();
			break;


			case 3:
			printpackage.PrintLogicWordCount PrintLogicWordCountInsatance = new printpackage.PrintLogicWordCount();
			PrintLogicWordCountInsatance.printWordCount();
			break;

			default:
			System.out.println("not an option");

		}
		
		
	}

}