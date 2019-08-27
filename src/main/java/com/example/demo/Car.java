package com.example.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
    @NotNull
    @Min(1)
    private long model;

    @NotNull
    @Size(min=3, max=10)
    private String type;

    @NotNull
    @Size(min=10, max=30)
    private String description;

    public long getModel() {
        return model;
    }

    public void setModel(long model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
