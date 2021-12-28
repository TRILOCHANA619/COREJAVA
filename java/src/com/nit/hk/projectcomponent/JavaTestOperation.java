package com.nit.hk.projectcomponent;


public class JavaTestOperation {
	public static void checkEmpty(CharSequence cs) {
		if (cs.isEmpty()) {
			System.out.println("enter username");
		} else {
			System.out.println("Welcome to NIT");

		}//if
	}//check Empty or not
	
	//creating method for checking the string is blank or not
	public static void checkBlank(String s) {
		if (s.isBlank()) {
			System.out.println("enter username");
		} else {
			System.out.println("Welcome to NIT");

		}//if
	}
	//check number of character in the string
	public static void numbeerOfCharacter(CharSequence ch) {
		System.out.println(ch+" has "+ch.length()+" letters");
	}
	
	//check the length in between 8 to 12
	public static void checkNumberOfCharacter(CharSequence ch) {
		if (ch.length()>=8 && ch.length()<=16) {
			System.out.println("Welcom to naresh I technology");
		} else {
			System.out.println("Password is not between 8 to 16");
		}//if
	}
	//check the length and only number
	public static void checkMobileNumber(CharSequence ch) {
		if (ch.length()==10) {
			boolean check=false;
			for (int i = 0; i < ch.length(); i++) {
				if (ch.charAt(i)>='0' && ch.charAt(i)<='9') {
					check=true;
				} else {
					check=false;
					break;
				}
			}
			if (check) {
				System.out.println("otp sent to mobile no for verification");
			} else {
				System.out.println("invalid mobile no");
			}
		} else {
			System.out.println("mobile  no should be 10 digit");
		}
	}
	//check name
	public static String checkName(CharSequence ch) {
		return ch+".  your name has "+ch.length()+" letter";
	}
	//checking the username and password
	public static void checkID(String userID,String password) {
		if (userID.equals("GabarSing") &&  password.equals("Pawan Kalyan")) {
			System.out.println("welcom to NIT");
		} else {
			System.out.println("Invalid user id password");
		}
	}
	
	//check the sub string
	public static void checkSubString(String s) {
		if (s.contains("hari")) {
			System.out.println("Hari is available");
		}else {
			System.out.println("Hari is not available");
		}
	}
	
	//check the sub string IgnourCase
	public static void checkSubStringCase(String s) {
		if (s.toLowerCase().contains("hari")) {
			System.out.println("Hari is available");
		}else {
			System.out.println("Hari is not available");
		}
	}
	
	//cHECK TJE SUBSTRING WITH LEER
	public static void checkSubStrinLetter(String s) {
		if (s.toLowerCase().contains("h") && s.toLowerCase().contains("a") && s.toLowerCase().contains("r") && s.toLowerCase().contains("i")) {
			System.out.println("Hari is available");
		}else {
			System.out.println("Hari is not available");
		}
		
	}
	
	//Check Hari is available or not
	public static void  checkHariOrNot(String s) {
		String s1=s.toLowerCase();
		
		//if (s1.contains("hari")) {
			int start=s1.indexOf("hari");
		if (start!=-1) {
			int end=start+4;
			String hari=s.substring(start, end);
			System.out.println(hari+" is available");
		}else {
			System.out.println("hari is not available");
		}
	}
	
	//Check .txt file of not
	public static void checkTextOrNot(String s) {
		if (s.toLowerCase().endsWith(".txt")) {
			System.out.println(s+" is a text file");
		}else {
			System.out.println(s+" is not a text file");
		}
	}
	
	//Print the length and each character of the string
	public static void printLengthChar(String s) {
		int length=s.length();
		System.out.println("the length of the string is:-"+length);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=' ') {
				System.out.println("Character "+i+"  ="+s.charAt(i));
			}else {
				System.out.println("Character "+i+"  ="+"space");
			}
		}
	}
	//Print the no  of occurance and index of the string
		public static void printIndexAndOccurance(String s) {
			int occurance=0;
			for (int i = 0; i < s.length(); i++) {
				if (s.toLowerCase().charAt(i)=='a') {
					occurance=occurance+1;
					System.out.println(s.indexOf("a", i)+1);
				}
			}
			System.out.println("Total number of occurance is:- "+occurance);
		}
		
	//Reverse the string 
		public static void reverseString(String s) {
			String[] sa=s.split(" ");
			//String str="";
			
			StringBuilder sb=new StringBuilder();
			for (int i = sa.length-1; i>=0; i--) {
			//	str=str.concat(sa[i]+" ");
				sb.append(sa[i]);
				sb.append(" ");
			}
			System.out.println(sb.toString().trim());
		}
		
	// Reverse the string Characterwise
		public static String reverse(String s) {
			StringBuilder sb=new StringBuilder();
			
			for (int i = s.length()-1; i >=0; i--) {
				sb.append(s.charAt(i));
			}
			return sb.toString();
		}
	
	//Palendrom or not
		public static void palandrom(String s) {
			String sr=reverse(s);
			if (s.equals(sr)) {
				System.out.println("Reverse string is:- "+sr);
				System.out.println("string is palandrom ");
			} else {
				System.out.println("Reverse string is:- "+sr);
				System.out.println("string is not-palandrom ");
			}
		}
}
