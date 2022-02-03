package com.dxc.libraryrestapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class indexcontroller {

    @GetMapping("/book")
    public String book(){
        return "Hello from spring boot";
    } 
    @GetMapping("/book/{name}")
    public String helloName(@PathVariable String name ){
        return "Hello from spring boot= " + name;
    } 
    
}
