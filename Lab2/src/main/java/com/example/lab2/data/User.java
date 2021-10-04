package com.example.lab2.data;

import java.util.UUID;

public class User {
    private UUID id = UUID.randomUUID();
    private ContactInfo contactInfo;
    private String name;

    public User(ContactInfo contactInfo, String name) {
        this.contactInfo = contactInfo;
        this.name = name;
    }

    public User() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
