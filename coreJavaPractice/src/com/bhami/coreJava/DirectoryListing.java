package com.bhami.coreJava;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;

public class DirectoryListing {
	
	
	public static void main(String[] args) {
		System.out.println("Inside main: ");
		ArrayList dirs = new ArrayList();
		String dirPath = "C:\\Users\\Bhami\\Resume";
		File baseDir = new File(dirPath);
		getDirectories(baseDir, dirs);
		File dir;
		System.out.println("sub directories in the directory" + baseDir.getAbsolutePath());
		System.out.println("no of subdirectories" + dirs.size());
		for(int count=0; count<dirs.size(); count++){
			dir = (File)dirs.get(count);
			System.out.println(dir.getAbsolutePath());
		}
		

	}
	
	public static void getDirectories(File dir, ArrayList dirs){
		//DirectoryListing.DirectoryFilter directoryFilterObj = new DirectoryListing().new DirectoryFilter();
		//boolean result = directoryFilterObj.accept(dir);
		
		File[] subDirs = dir.listFiles(new DirectoryFilter());
		System.out.println("SubDir is : " + subDirs.toString());
		for(int i=0; i< subDirs.length; i++){
			File subdir = subDirs[i];
			dirs.add(subdir);
			getDirectories(subdir, dirs);
		}
	}
}

class DirectoryFilter implements FileFilter{
	public boolean accept(File file) {
		System.out.println("Inside directory Filter: " + file.isDirectory());
		return file.isDirectory();
	}
	
}



