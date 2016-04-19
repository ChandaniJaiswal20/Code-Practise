package ArrayPractise;

import java.util.Scanner;

//Assume you have a method isSubstring which checks if one word is a
//substring of another. Given two strings, s1 and s2, write code to check 
//if s2 is a rotation of s1 using only one call to isSubstring 
//(i.e., “waterbottle” is a rotation of “erbottlewat”).

public class WordRotation {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		 
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		
		if(string1.length()!=string2.length()){
			
			System.out.println(string2 + " is not a rotation of "+ string1);
			System.exit(0);
			
		}
		int position 	=	0;
		//String rotWord	=	"";
		String rotationWord	=	"";
		
		for(int i=0;i<string1.length();i++){
			
	
			while(position<string2.length()){	
			if(	string1.charAt(i)==string2.charAt(position)){
				
				
				position= position+1;
		//		rotWord	=	rotWord+ string1.charAt(i);
				break;
			}
			rotationWord	=	rotationWord + string2.charAt(position);
			position++;	
				
			}
			
			
				}
		
				
		if(isSubString(string1,rotationWord))
		System.out.println(string2+"  is the rotation of  "+string1);
		else
		System.out.println(string2+"  is the not rotation of  "+string1);
	}
	
		public static boolean isSubString(String wholeString,String subString){
			
			if(wholeString.contains(subString)){
				
				return true;
			}
			return false;
		}
}
