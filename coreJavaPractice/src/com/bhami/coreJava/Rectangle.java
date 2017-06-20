package com.bhami.coreJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Rectangle implements Serializable {
	
	public Rectangle(int height, int width){
		this.height = height;
		this.width = width;
		area= height * width;
	}
	
	int height;
	int width;
	int area;
	
	public static void main(String[] args) {
	  try
	  {
		FileOutputStream fileStream = new FileOutputStream("Rectangle.ser");
		ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
		objectStream.writeObject(new Rectangle(5,6));
		objectStream.close();
	  }catch (IOException e)
	  {
		  System.out.println("Exception caught...args great Bhami");
		  
	  }
	  
	  try
	  {
		FileInputStream fileInStream = new FileInputStream("Rectangle.ser");
		ObjectInputStream objectInStream = new ObjectInputStream(fileInStream);
		Rectangle recObj = (Rectangle)objectInStream.readObject();
		objectInStream.close();
		System.out.println(recObj.height +  "width : " + recObj.area);
	  
	  }catch (IOException e)
	  {
		  System.out.println("Exception caught...args great Bhami");
		  
	  }catch (ClassNotFoundException c){
		  System.out.println("Exception caught...args great Bhami");
	  }
	}

}
