package com.dxc;
import java.util.List;
import com.dxc.assessment.model.Author;

public class AuthorDao{

    private static final String INSERT_ONE_AUTHOR;
    private static final String SELECT_ALL_AUTHOR;
   
   
    private static final String USER_NAME;
    private static final String PASSWORD;
    private static final String URL;
    
    static{

        INSERT_ONE_AUTHOR = "INSERT INTO AUTHOR (firstName, lastName, genere, email) VALUES (?, ?, ?)";
        SELECT_ALL_AUTHOR = "SELECT * FROM AUTHOR";
        USER_NAME = "root";
        PASSWORD = "password";
        URL = "jdbc:mysql://localhost:3307/dxc";
    }
    
    
    
    
    
    

    Author create(Author author);

    Author findById(Long id);
    
    List<Author> findByGenre(String genre);

    List<Author> findAll();
    

}


