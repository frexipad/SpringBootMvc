package com.frexdel.test.model;

import java.util.List;

public class Roles {
    private String name;
    private List<User> users;

    public Roles() {
    }

    public Roles(String name, List<User> users) {
        this.name = name;
        this.users = users;
    }

    public Roles(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
