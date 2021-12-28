class Student
{
	int redgno;
	String name;
	String course;
	double fee;

	Student(int redgno,String name,String course,double fee){
		this.name =name;
		this.redgno=redgno;
		this.course=course;
		this.fee=fee;
	}

	@Override
	public int hashCode(){
		return course.hashCode();
	}

	@Override
	public boolean equals(Object obj){
		if (obj instanceof Student s)
		{
			return this.name.equals(s.name) &&
					this.redgno==s.redgno &&
					this.course.equals(s.course)&&
					this.fee==s.fee;
		}
		return false;
	}
	@Override 
	public String toString(){
		return "Student("+redgno+","+name+","+course+","+fee+")";
	}
}


class Test 
{
	public static void main(String[] args) 
	{
		Student s1=new Student(5,"hari","cj",2500);
		Student s2=new Student(3,"Bk","Core Java",3500);
		Student s3=new Student(3,"Bk","Core Java",3500);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}
}
/* for compile in java 15 compile in Command Prompt
			javac  --enable-preview -source 15 -Xlint:preview Test.java
	And for run 
			java  --enable-preview   Test*/