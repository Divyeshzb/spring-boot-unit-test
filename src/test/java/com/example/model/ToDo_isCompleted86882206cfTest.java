package com.example.model;

public class ToDo {

    private boolean completed;

    public ToDo() {
        this.completed = false;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return this.completed;
    }
}
