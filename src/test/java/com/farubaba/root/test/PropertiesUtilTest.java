package com.farubaba.root.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import org.junit.Test;

import com.farubaba.root.utils.PropertiesUtil;


public class PropertiesUtilTest {

	/**
	 * 文件不不不在src/main/resources/ 下，而在pom.xml同一级目录，则直接配置文件名称就是文件路径
	 */
	@Test
	public void readPropertiesFromProjectRoot() {
		String pathname = "farubaba.properties";
		Properties prop = PropertiesUtil.loadProperties(pathname);
		assertNotNull(prop.getProperty("proxy_port"));
		assertEquals("8888", prop.getProperty("proxy_port"));
	}
	
	/**
	 * 文件在src/main/resources/ 下，最终编译后会被放在project root 目录，即： “/” 目录。
	 * 配置文件名称前面增加一个 "/"即可。
	 * getClass().getResourceAsStream(pathname) 获得inputstream
	 * 
	 */
	@Test
	public void readProp_Src_Main_Resources() {
		String pathname = "/src_main_resources.properties";
		Properties prop = PropertiesUtil.loadProperties(getClass().getResourceAsStream(pathname));
		assertNotNull(prop.getProperty("proxy_port"));
		assertEquals("8888", prop.getProperty("proxy_port"));
	}
}
