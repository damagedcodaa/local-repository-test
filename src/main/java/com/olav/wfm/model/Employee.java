package com.olav.wfm.model;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga A on 11.05.2017.
 */
public class Employee {

    String name;
    String surname;

    List<Skill> skillset;

    public Employee() {
        
    }

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Skill> getSkillset() {
        if (CollectionUtils.isEmpty(skillset)) {
            skillset = new ArrayList<Skill>();
        }
        return skillset;
    }

}
