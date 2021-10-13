package com.example.report.model;

import org.springframework.data.annotation.Id;

//@Document //to change mapping name in db
public class Report {
    @Id
    //@GeneratedValue
    private String id;
    private String name;
    private boolean completed;

    public Report() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
