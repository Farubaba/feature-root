package com.farubaba.root.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Properties;

public class PropertiesUtil {
	
	public static Properties loadProperties(String propertiesFileName) {
		Properties prop = new Properties();
		FileInputStream inStream = null;
		try {
			inStream = new FileInputStream(propertiesFileName);
			prop.load(inStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			CloseUtil.closeIO(inStream);
		}
		return prop;
	}
	
	public static Properties loadProperties(File file) {
		Properties prop = new Properties();
		FileInputStream inStream = null;
		try {
			inStream = new FileInputStream(file);
			prop.load(inStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			CloseUtil.closeIO(inStream);
		}
		return prop;
	}
	
	public static Properties loadProperties(InputStream inputStream) {
		Properties prop = new Properties();
		if(inputStream != null) {
			try {
				prop.load(inputStream);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				CloseUtil.closeIO(inputStream);
			}
		}
		return prop;
	}
	
	public static Properties loadPropertiesFromXML(InputStream inXML) {
		Properties prop = new Properties();
		try {
			prop.loadFromXML(inXML);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			CloseUtil.closeIO(inXML);
		}
		return prop;
	}
	
	public static Properties loadProperties(Reader reader) {
		Properties prop = new Properties();
		try {
			prop.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			CloseUtil.closeIO(reader);
		}
		return prop;
	}
}
