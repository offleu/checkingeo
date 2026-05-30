package com.inovaa.checkingeo.entinty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name = "users")
@Getter
@Setter

public class User {

    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    
    private Long id;

    private String name;
    
    private String email;

    private String password;

    private String role;

    //GETTER E SETTER

    public Long getId () {
        return id;
    }

    public String getName (){
        return name;
    }


}
