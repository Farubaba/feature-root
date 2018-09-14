package com.farubaba.root.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.farubaba.root.json.JsonFactory;
import com.farubaba.root.json.JsonService;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test
    public void testJson() {
    	JsonService<?> jsonService = JsonFactory.getJsonService();
    	
    	String jsonString  = jsonService.toJsonString(new User("zhangsan",23));
    	User user = jsonService.fromJson(jsonString, User.class);
    	assertEquals("zhangsan", user.name);
    	assertEquals(23, user.age);
    }
    
    class User{
    	String name;
    	int age;
    	public User(String name , int age) {
    		this.name = name;
    		this.age = age;
    	}
    }
}
