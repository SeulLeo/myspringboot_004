package com.zk.myspringboot_004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zk.myspringboottest.SpringBoottest;

@SpringBootApplication
public class SpringBootApp{

	public static void main(String[]args){
		SpringApplication.run(SpringBootApp.class, args);
		SpringBoottest s=new SpringBoottest();
		s.contextLoad();
	}

}