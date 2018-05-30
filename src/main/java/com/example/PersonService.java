package com.example;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class PersonService {
 
private PersonDAO personDao;
 
public PersonDAO getPersonDao() {
return personDao;
}
 
@Autowired
public void setPersonDAO (PersonDAO personDao) {
this.personDao = personDao;
}
 
public void addPerson(Person person) {
getPersonDao().insert(person);
}
 
public List<Person> fetchAllPersons() {
return getPersonDao().selectAll();
}
}
