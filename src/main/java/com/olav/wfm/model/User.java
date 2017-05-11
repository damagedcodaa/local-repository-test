package com.olav.wfm.model;

import org.springframework.stereotype.Component;

/**
 * Created by Olga A on 10.05.2017.
 */

@Component
public class User {

    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
