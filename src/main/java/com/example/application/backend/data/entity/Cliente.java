package com.example.application.backend.data.entity;

import javax.validation.constraints.NotEmpty;

public class Cliente extends AbstractEntity {

    @NotEmpty
    private String name;

    public Cliente() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
