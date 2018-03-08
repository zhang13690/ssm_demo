package com.zhang.domain;

import java.io.Serializable;

public class Employee implements Serializable {
    private Integer id;
    private String name;

    // setter和getter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
