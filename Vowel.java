package ram;

import java.util.Scanner;

public class Vowel {
	
    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a String: ");
	        String input1 = sc.next();

	        VowelsAndConsonants vc = new VowelsAndConsonants(input1.toLowerCase());

	        boolean flag =true;
	        while (flag) {
	            System.out.println("\nWhat would you like to do? Enter:\n" + "'a' to count the vowels\n"
	                    + "'b' to count consonants\n" + "'c' to count both vowels and consonants\n"
	                    + "'d' to enter another String\n" + "'e' to exit the program");
	            String input2 = sc.next();
	            switch (input2) {
	                case  "a":
	                    System.out.println("Vowels: " + vc.vowelsCount());
	                    break;
	                case "b":
	                    System.out.println("Consonants: " + vc.consonantCount());
	                    break;
	                case "c":
	                	/*for(int i=0; i<str.length(); i++) {
	        				
	                  	   char c = str.charAt(i);
	         				if(c == 'a' || c == 'e' || c == 'i' || 
	         						c == 'o' || c == 'u') {
	         					vc.vowelsCount+=1;
	         					
	         				}
	         				else {
	         					if(c >= 'a' && c < 'z') {
	         						 vc.consonantCount+= 1;
	         					}
	         				}
	         			}*/
	         			System.out.println(vc.consonantCount()+" "+vc.vowelsCount());

	                    System.out.println("Vowels: " + vc.vowelsCount());
	                    System.out.println("Consonants: " + vc.consonantCount());
	                    break;
	                case "d":
	                    System.out.println("Enter another string: ");
	                    input1 = sc.next();
	                    vc = new VowelsAndConsonants(input1.toLowerCase());
	                    break;
	                case "e":
	                    flag=false;
	                    break;
	                default:
	                    System.out.println("wrong selection please try again");

	           }
	        }
	        System.out.println("Have a great day!");
	    }
	}
	class VowelsAndConsonants {
	    String str;
	    public  VowelsAndConsonants(String str){
	        this.str= str;
	    }
	    public int vowelsCount(){
	        str = str.replaceAll("[\\W]", "");  
	        int strLength = str.length();
	        str = str.replaceAll("[aeiou]", "");
	        return strLength-str.length();
	    }

	    public int consonantCount(){
	       str = str.replaceAll("[\\W]", "");  
	        int strLength = str.length();
	        str = str.replaceAll("[aeiou]", "");
	        return str.length();
	    }
	    
	}
	   


