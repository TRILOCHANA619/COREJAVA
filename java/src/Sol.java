
public class Sol {

	public int x;
	public int y;
	
	void call(int a,int b) {
		x=a+1;
		y=b;
	}
	public static void main(String[] args) {
	Sol s=new Sol();
	s.call(2,3);
	System.out.println(s.x+"  "+s.y);
		
	}

}
