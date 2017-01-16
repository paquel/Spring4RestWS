package com.concretepage.component;

import org.springframework.stereotype.Component;

import com.concretepage.Person;

@Component
public class PersonService implements IPersonService {
	@Override
	public Person getPersonDetail(Integer id){
		Person p = new Person();
		p.setId(id);
		p.setLocation("Saddle Brook Jan 16 11:34 am");
		p.setName("Lenny");
		return p;
	}
}
