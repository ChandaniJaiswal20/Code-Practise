package ArrayPractise;

import java.util.Scanner;

//Design an algorithm and write code to remove the duplicate characters
//in a string without using any additional buffer.
//NOTE: One or two additional variables are fine. An extra copy of the array is not.
//FOLLOW UP
//Write the test cases for this method.
//chandani
public class RemoveDuplicateCharacter {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String uniqueCharterString	=	"";	
	String input	=	sc.nextLine();
	
	for(int i=0;i<input.length();i++){
		boolean repeat	=	false;
			for(int j=i+1;j<input.length();j++){
				
				
				if((input.charAt(i)==input.charAt(j))){
					
					
					repeat	=	true;
					break;
				}
				
				
			}
			if(!repeat){
			uniqueCharterString	=	uniqueCharterString + input.charAt(i);
			}
	}
	System.out.println(uniqueCharterString);
}
}
