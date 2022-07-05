package com.hybrid.Utilities;
//listner ani excel sheet related je khi ah te yat yenar
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {   

	 Properties prop;   //class declare
	String path="C:\\Users\\vikra\\eclipse-workspace\\HybridMavenProject\\Configuration\\Config.properties";
	
  public ReadConfig()     //constructor
  {
	  prop=new Properties();  //class initialize
	  
	  
	  // construction mdhe ekhada exception yet asel tr to try&cattch nech solve kraycha
	  
	  
	  try {                                      
		  FileInputStream fl = new FileInputStream(path);

		prop.load(fl);
	} catch (Exception e) {
		e.printStackTrace();
	}
  }
  
  public String getBaseurl()
  {
	  String value=prop.getProperty("baseurl");
	  
	  if(value!=null)
	  { 
	  return value;
	  }
	  else {
		 throw new RuntimeException("url not Specified in config File") ;
	  }
  }
  
  
  public String getBrowser()
  {
	  String Browser=prop.getProperty("browser");
	  
	  if(Browser!=null)
	  { 
	  return Browser;
	  }
	  else {
		 throw new RuntimeException("url not Specified in config File") ;
	  }
  }
  

  public String getusername()
  {
	  String username=prop.getProperty("username");
	  
	  if(username!=null)
	  { 
	  return username;
	  }
	  else {
		 throw new RuntimeException("username is not match") ;
	  }
  }
  
  
  public String getpass()
  {
	  String passward=prop.getProperty("passward");
	  
	  if(passward!=null)
	  { 
	  return passward;
	  }
	  else {
		 throw new RuntimeException("passward is not match") ;
	  }
  }
  
  
  
  
  
  
  
  
  
}







