package com.bhami.fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.omg.CORBA.portable.OutputStream;

public class FileRW {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File path = new File("fileIo.txt");
		System.out.println("Does file exists : " + path.exists());
		System.out.println("Is file directory : " + path.isDirectory());
		String content = "Hello Bhami, how r you today after bad interview";
		try {
			java.io.OutputStream outStream = new FileOutputStream(path);
			outStream.write(content.getBytes());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
