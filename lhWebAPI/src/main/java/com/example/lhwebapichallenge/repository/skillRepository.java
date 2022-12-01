package com.example.lhwebapichallenge.repository;

import com.example.lhwebapichallenge.models.skill;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class skillRepository {

    List<skill> skills = new ArrayList<>();

    public skillRepository() {
        skill s = new skill("jassen", 9);
        skills.add(s);
    }

    public List<skill> findAll() {
        return skills;
    }

    public List<skill> findByName(String name) {
        List<skill> matches = new ArrayList<>();
        for(skill s: skills){
            if(s.getName().equals(name)) matches.add(s);
        }
        return matches;
    }

    public List<skill> findByFirstName(String name) {
        List<skill> matches = new ArrayList<>();
        for(skill s: skills){
            if(s.getName().equals(name)) matches.add(s);
        }
        return matches;
    }

    public skill create(skill c) {
        skills.add(c);
        return c;
    }

    public void update(skill snew, String name){
        for(skill s: skills){
            if(s.getName().equals(name)) s = snew;
        }
    }

    public void delete(String name) {
        skills.removeIf(skill -> skill.getName().equals(name));
    }

}