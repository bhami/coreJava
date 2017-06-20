package com.bhami.coreJava.springmail;

import org.springframework.beans.factory.*;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

@SuppressWarnings("deprecation")
public class Test {   
	public static void main(String[] args) {  
      
		Resource r=new ClassPathResource("applicationContext.xml");  
		BeanFactory b=new XmlBeanFactory(r);  
		MailMail m=(MailMail)b.getBean("mailMail");  
		String sender="jainbhami@gmail.com";//write here sender gmail id  
		String receiver="coutlook@gmail.com";//write here receiver id  
		m.sendMail(sender,receiver,"hi","welcome");  
		      
		System.out.println("success");  
	}  
}