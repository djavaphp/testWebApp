package com.unitedcoders.demo;

import javax.jws.WebService;

@WebService
public interface PersonService {

    public String greetPerson(String name);
    public int addNum(int a , int b);

}
