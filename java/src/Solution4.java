
public class Solution4 {
	
	public Solution4() {
		System.out.println("hi");
	}
	public Solution4(int a,int b) {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		int num=541;
		
		String[] number= {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		int i=0,j=0,k=0;
		while(num!=0) {
			i=num%10;
			k=(k*10)+i;
			num=num/10;
		}
		//System.out.println(k);
		while(k!=0) {
			j=k%10;
			System.out.print(number[j]+" ");
			k=k/10;
		}
	}

}
