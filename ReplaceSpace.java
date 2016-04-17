package ArrayPractise;

import java.util.Scanner;

//Write a method to replace all spaces in a string with ‘%20’
//my name is chandani
public class ReplaceSpace {
	
	public static void main(String[] args) {
		String modifiedString	=	"";
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		for(int i=0;i<input.length();i++){
			
			if(' '==input.charAt(i)){
				
				modifiedString	=modifiedString+ "%20";
			}
			else{
				
				modifiedString	=modifiedString+ input.charAt(i);
			}
			
		}
		
		System.out.println("Modified String::: "+modifiedString );
		
	}
	
	
	
}
