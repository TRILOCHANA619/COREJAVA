package com.ni.hk.string.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nit.hk.projectcomponent.JavaTestOperation;

public class Project_CheckTextFileOrNot {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Ente the file name:-");
			String file=br.readLine();
			JavaTestOperation.checkTextOrNot(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
