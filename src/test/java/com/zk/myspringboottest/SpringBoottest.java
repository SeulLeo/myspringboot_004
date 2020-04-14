package com.zk.myspringboottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zk.myspringboot_004.Person;
import com.zk.myspringboot_004.SpringBootApp;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={SpringBootApp.class})
public class SpringBoottest {
	
	@Autowired
	Person person;
	
	@Test
	public void contextLoad(){
		System.out.println(person);
	}
}
