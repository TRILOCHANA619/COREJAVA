import java.util.Scanner;

public class SunDigit {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String anything=scn.nextLine();
		int length=0;
		//System.out.println(length);
		int sum=0;
		//double result=0.0;
		for (int i = 0; i < anything.length(); i++) {
			Character ch=anything.charAt(i);
			//System.out.println(ch);
			if (Character.isDigit(ch)) {
				//System.out.println((int)ch);
				sum=sum+(ch-48);
			//System.out.println(sum);
		}else if (ch>=64 && ch <=90 || ch>=97 && ch <=122) {
			length+=1;
			//System.out.println("length= "+length);
		}
		
	}
	//	System.out.println(sum);
		//result=(double)sum/length;
		System.out.println(Math.round((double)sum/length));
		//System.out.println(length);
		//System.out.println(Math.round(result));
	}
}
