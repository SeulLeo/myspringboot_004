package com.zk.myspringboot_004;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	Person person;
	
	@RequestMapping("/demo")
	public String hello()
	{
		return person.getLastName()+" "
	      +person.getAge()+" "+person.getBirth()+" "+person.getDog()+" "+person.getList()
	      +""+person.getMaps();
	}
}
