package com.petproject1.fullstackbackend.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Usr")
@Entity
public class User {

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long id;

    @Getter
    @Setter
    private String username;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;

}
