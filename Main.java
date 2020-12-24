//import package
import printpackage.*;
import java.util.*;
public class Main
{
	//method containnig the logic
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur choice: vowelsCount, reverseString");
		String s= sc.nextLine();
		switch(s)
		{
			case "vowelsCount":
			printpackage.PrintLogicVowelsCount PrintLogicVowelsCountInstance = new printpackage.PrintLogicVowelsCount();
			PrintLogicVowelsCountInstance.printVowelsCount();
			break;

			case "reverseString":
			printpackage.PrintLogicStringReverse PrintLogicStringReverseInstance = new printpackage.PrintLogicStringReverse();
			PrintLogicStringReverseInstance.printReverseString();
			break;


			default:
			System.out.println("not an option");

		}
		
		
	}

}