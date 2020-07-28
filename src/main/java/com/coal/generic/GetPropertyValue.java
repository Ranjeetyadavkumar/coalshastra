package com.coal.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetPropertyValue {
	
	public static final String FILE_PATH = "./coal.config";
	
	public static  String getValue(String key) {
		
		String Value = null;
		
		Properties pro = new Properties();
		try {
			pro.load(new FileInputStream(new File(FILE_PATH)));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		Value=pro.getProperty(key);
		
		return Value;
	}

}
