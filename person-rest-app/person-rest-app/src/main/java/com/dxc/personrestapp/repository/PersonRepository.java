package com.dxc.personrestapp.repository;

import com.dxc.personrestapp.model.Person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person,Integer> {
    
}
