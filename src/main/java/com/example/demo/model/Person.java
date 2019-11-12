package com.example.demo.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Person {
    private final UUID id;
    @NotBlank
    private final String name;
    private final String password;

    public String getName() {
        return name;
    }

    public String getPassword() { return password; }

    public UUID getId() {
        return id;
    }

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name, @JsonProperty("password") String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

}
