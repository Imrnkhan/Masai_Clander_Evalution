package com.example.masai_clander.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;
import java.util.List;

@Entity
@Data
public class  Event {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int mailId;

    @JsonIgnore
    private ZonedDateTime timeStamp;

    @ManyToOne
    @JsonIgnoreProperties(value = { "firstName", "lastName", "mobileNumber", "dateOfBirth", "password", "role" })
    private User sender;

    @ManyToMany
    @JsonIgnoreProperties(value = { "firstName", "lastName", "mobileNumber", "dateOfBirth", "password", "role" })
    private List<User> recievers;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "content_id")
    private Content content;

    private String subject;

    private String body;

}
