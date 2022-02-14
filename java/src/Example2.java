import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		
		String s="WELCOME";
		char[] s2=s.toCharArray();
		System.out.println("Input is:: "+s);
		char[] s3=new char[s2.length];
		for(int i=0;i<s2.length;i++) {
			int a=i+2;
			if(a<s2.length) {
				s3[a]=s2[i];
			}else {
				a=a-s2.length;
				s3[a]=s2[i];
			}
		}
	
		System.out.println("Output is ::"+String.valueOf(s3));
		
	}

}
