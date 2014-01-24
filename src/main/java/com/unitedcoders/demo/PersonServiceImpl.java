package com.unitedcoders.demo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.unitedcoders.demo.PersonService")
public class PersonServiceImpl implements PersonService {

    public String greetPerson(String name) {
        Person person = new Person(name);

        return "Hello " + person.getName() + "!";
    }

	public int addNum(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

}
