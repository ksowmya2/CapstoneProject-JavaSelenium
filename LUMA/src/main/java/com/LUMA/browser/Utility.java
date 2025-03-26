package com.LUMA.browser;

import java.io.FileReader;
import java.util.Properties;

public class Utility {
    //to read data from configure.properties file
	 public static String properties(String data) throws Exception {
	        String propertiesData = null;
	        try {
	            //storing the configure.properties file path in a filepath variable
	            String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\Configure.properties";
	            FileReader reader = new FileReader(filePath);
	            Properties p = new Properties();
	            p.load(reader);
	            propertiesData = p.getProperty(data);   
	        } catch (Exception e) {
	            System.out.println("Utility - properties: " + e.getMessage());
	        }
	        return propertiesData;   
	    }

}
