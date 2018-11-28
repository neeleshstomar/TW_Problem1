package com.commerce.generics;

import java.io.FileInputStream;
import java.util.Properties;

public class Utility implements IAutoConstant {

	public static String getPropertyValue(String propertyName) {
		String propertyValue = "";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_PATH));
			propertyValue = prop.getProperty(propertyName);
		} catch (Exception e) {
		}
		return propertyValue;
	}

}
