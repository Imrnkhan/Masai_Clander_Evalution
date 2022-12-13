package com.example.masai_clander.Model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;

@Entity
@Data
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

//    @OneToMany(mappedBy = "content", cascade = CascadeType.ALL)
//    private List<Attachment> attachments = new ArrayList<>();

}
