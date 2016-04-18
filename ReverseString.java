package ArrayPractise;

import java.util.Scanner;

//Write code to reverse a C-Style String.
//(C-String means that “abcd” is represented as five characters, 
//		including the null character.)
//abcd/o
public class ReverseString {

	public static void main(String[] args) {
		String reverseString = "";
		Scanner sc= new Scanner(System.in);
		
		String input = sc.nextLine();
		
		for(int i=input.length()-2;i>=0;i--)
		{
			reverseString	=	reverseString	+	input.charAt(i);
			
			
		}		
		
		System.out.println("Reverse String ::"+ reverseString);
	}
	
}
