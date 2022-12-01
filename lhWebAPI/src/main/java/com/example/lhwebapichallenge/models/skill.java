package com.example.lhwebapichallenge.models;

import java.util.List;

public class skill {

    private String name;
    private int level;

    public skill(){
    }

    public skill(String name, int level){
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
