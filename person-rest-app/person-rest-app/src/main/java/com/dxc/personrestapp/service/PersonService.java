package com.dxc.personrestapp.service;

import java.util.List;

import com.dxc.personrestapp.model.Person;

public interface PersonService {
    public Person getPersonById(int id);
    public Person createPerson(String person);
    public Person updatePerson(Person person);
    public void deletePerson (int id);
    public List<Person> getAllPersons();
    
    
}
