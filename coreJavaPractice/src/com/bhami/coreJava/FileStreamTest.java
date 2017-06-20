package com.bhami.coreJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fs = new FileInputStream("C:/Users/Bhami/eclipseLuna1/coreJavaPractice/src/com/bhami/coreJava/testInput.data");
			FileOutputStream fout = new FileOutputStream("C:/Users/Bhami/eclipseLuna1/coreJavaPractice/src/com/bhami/coreJava/testOutput.data");
			int c;
			while((c=fs.read()) != -1){
				System.out.println("reading file :" + c);
				fout.write(c);
			}
			fs.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
