package com.bhami.coreJava;

import java.io.File;

public class FileListing {

	public static void main(String[] args) {
		System.out.println("Inside main: ");
		String dir = "C:\\Installed by Copying";
		File baseDir = new File(dir);
		if(baseDir != null && baseDir.exists()){
			File[] files = baseDir.listFiles();
			System.out.println("Files in the directory : " + baseDir.getAbsolutePath());
			System.out.println("Number of files :" + files.length);
			File file;
			for (int i=0; i<files.length; i++){
				file = files[i];
				if(file.isDirectory())
					System.out.println("Directory :" + file.getName());
				else
					System.out.println("File :" + file.getName());
			}
		}
		

	}

}
