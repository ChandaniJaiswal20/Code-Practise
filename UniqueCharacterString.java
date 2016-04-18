package ArrayPractise;

import java.util.Scanner;

//Implement an algorithm to determine if a string has all unique characters.
//What if you can not use additional data structures?

//chcndani
public class UniqueCharacterString {
		
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		String input	= sc.nextLine();
		
		for(int i=0;i<input.length();i++){
			
		
			
			for(int j=i+1;j<input.length();j++){
				
				if(input.charAt(i)==input.charAt(j)){
					System.out.println("Duplicate character found ::"+input.charAt(i));
					break;
					
				}
				
				
			}
			
		}
		
		
	}
	
	
}
