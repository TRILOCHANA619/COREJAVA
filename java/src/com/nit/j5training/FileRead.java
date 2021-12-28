package com.nit.j5training;

import java.io.FileReader;
import java.io.FileWriter;

public class FileRead {

	
		public void fileOperator() throws Exception{
		FileWriter fw=new FileWriter("D:\\01cj\\IO Stream\\100.txt",true);
		FileReader fr=new FileReader("D:\\01cj\\IO Stream\\100.txt");
			fw.write("java is aawsome");
		System.out.println(fr.read());
		fw.close();
		fr.close();
		}
		public static void main(String[] args) throws Exception 
		{
			new FileRead().fileOperator();
			//System.out.println("Hello World!");
		

	}

}
