package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Assignment {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String number;
    private String description;

    public Assignment() {
        super();
    }

    public Assignment(Long id, String name, String number, String description) {
        super();
        this.id = id;
        this.name = name;
        this.number = number;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
