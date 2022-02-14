import java.util.Arrays;

public class StringMoveToSecondPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="WELCOME";
		char[] s2=s.toCharArray();
		
		System.out.println("Input is:: "+s);
		//System.out.println(Arrays.toString(s2));
		char[] s3=new char[s2.length];
		
		for(int i=0;i<s2.length;i++) {
			int a=i+2;
			if(a<s2.length) {
		//		System.out.print(s2[a]);
				s3[a]=s2[i];
			
			}else {
				a=a-s2.length;
				//System.out.print(s2[a]);
				
				s3[a]=s2[i];
				
				
			}
		}
	//System.out.print(Arrays.toString(s3));
		System.out.println("Output is ::"+String.valueOf(s3));
		
	}

}
