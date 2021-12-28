import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Staticmember {
	static  int a=10;
	static {
		System.out.println(a);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		System.out.println(s.length());
		Scanner scn=new Scanner(System.in);
		String s1=scn.nextLine();
		System.out.println(s1.length());
		scn.close();
	}

	static {
	//	System.out.println(b);
	}
	static int b;
}
