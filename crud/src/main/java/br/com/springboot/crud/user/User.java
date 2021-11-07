package br.com.springboot.crud.user;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;

@Entity
public class User {
    
    @Id
    @Generated(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "Name is mandatory")
    private String name;
    
    @NotBlank(message = "Email is mandatory")
    private String email;

    // standard constructors / setters / getters / toString
}