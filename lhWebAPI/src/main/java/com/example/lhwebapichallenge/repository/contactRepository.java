package com.example.lhwebapichallenge.repository;

import com.example.lhwebapichallenge.models.contact;
import com.example.lhwebapichallenge.models.skill;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class contactRepository {

    List<contact> contacts = new ArrayList<>();

    public contactRepository() {

    }

    public List<contact> findAll() {
        return contacts;
    }

    public List<contact> findByName(String fullName) {
        List<contact> matches = new ArrayList<>();
        for(contact c: contacts){
            if(c.getFullName().equals(fullName)) matches.add(c);
        }
        return matches;
    }

    public List<contact> findByFirstName(String firstName) {
        List<contact> matches = new ArrayList<>();
        for(contact c: contacts){
            if(c.getFirstName().equals(firstName)) matches.add(c);
        }
        return matches;
    }

    public contact create(contact c) {
        contacts.add(c);
        return c;
    }

    public void update(contact cnew, String fullName){
        for(contact c: contacts){
            if(c.getFullName().equals(fullName)) c = cnew;
        }
    }

    public void delete(String fullName) {
        contacts.removeIf(contact -> contact.getFullName().equals(fullName));
    }

}