package ArrayPractise;

import java.util.Scanner;

//Write a method to decide if two strings are anagrams or not.
//top   pot, pto, opt, otp, tpo, top
public class AnagramsString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String   string1 = sc.nextLine();
		
		String   string2 = sc.nextLine();
		 
		String modulatedString ="";
		if(string1.length()!=string2.length()){
			
			System.out.println(string1+ " is not anagram of "+string2);
			
			System.exit(0);
		}
		for(int i=0;i<string1.length();i++){
			char c= string1.charAt(i);
			boolean characterFound	=	false;
			
			for(int j=0;j<string1.length();j++){
				
				if(c==string2.charAt(j)){
					characterFound	=	true;
					break;
				}
			}//top opt
			if(characterFound){
			modulatedString	=	modulatedString + string1.charAt(i);
			}
			else{
				
				System.out.println(string1+ " is not anagram of "+string2 +" as "+ c +" is not found in "+string2 );
				System.exit(0);
			}
			
			}
			if(string1.equalsIgnoreCase(modulatedString)){
				
				System.out.println(string1 + " is anagrams of "+ string2 );
			}
			
			else{
				
				System.out.println(string1 + " is not anagrams of "+ string2 );
				
			}
				}
		
		
	}

