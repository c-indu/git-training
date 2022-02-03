package com.dxc.personrestapp.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.dxc.personrestapp.model.Person;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonController {
    
        @Autowired
        private PersonService personService;
        @Autowired
        private ModelMapper modelMapper;
        @GetMapping("/person")
        public ResponseEntity<List<Person>> findAllPeople(){
            List<Person> persons= PersonService.findAllPeople();
            return ResponseEntity.status(HttpStatus.OK).body(persons);
        }
        @PostMapping("/person")
        public ResponseEntity<Person> createPerson(@Valid @RequestBody PersonDTO personReqObj){
            Person person = modelMapper.map(personReqObj, Person.class);
            person.setDob(LocalDate.dob());
            return ResponseEntity.status(HttpStatus.CREATED).body(person);
        }
        @GetMapping("/person/{id}")
        public Person getPersonById(@PathVariable int id){
            return PersonService.getPersonById(id);
        }
        @PutMapping("/person/{id}")
        public Person updatePerson(@RequestBody Person person,@PathVariable int id){
           return personService.updatePerson(person);
        }
        @DeleteMapping("/person/{id}")
        public void deletePerson(@PathVariable int id){
            PersonService.delePerson(id);
        }
        @ResponseStatus(HttpStatus.BAD_REQUEST)
        @ExceptionHandler(MethodArgumentNotValidException.class)
        public  ResponseEntity<List<String> >hadleValidationException(MethodArgumentNotValidException ex, BindException bindingResult){
            BindingResult bindigResult=ex.getBindingResult();
            List<String>errors=new ArrayList<>();
          bindingResult.getAllErrors().forEach(error -> errors.add(error.getDefaultMessage()));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errors);
    
    }
    }
    
}
