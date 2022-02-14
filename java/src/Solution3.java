import java.util.Iterator;
import java.util.Scanner;

public class Solution3 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Number :: ");
		String num=scn.nextLine();
		
		char[] split=num.toCharArray();
		boolean flag=false;
		
		for(int i=0;i<split.length;i++) {
			if(split[i]=='0'||split[i]=='1') {
				flag=true;
			}else {
				flag=false;
				break;
			}
		}
		if (flag) {
			System.out.println(num+" Is a binarry number ");
		} else {
			System.out.println(num+" Is not a binary number");
		}

	}

}
