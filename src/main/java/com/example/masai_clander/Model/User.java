package com.example.masai_clander.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String event;
    private String mobile;

}
