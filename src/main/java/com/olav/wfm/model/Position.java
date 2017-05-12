package com.olav.wfm.model;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga A on 12.05.2017.
 */
public class Position {

    String name;
    String description;
    List<Skill> skillSet;
    Employee occupiedBy;
    Boolean status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Employee getOccupiedBy() {
        return occupiedBy;
    }

    public void setOccupiedBy(Employee occupiedBy) {
        this.occupiedBy = occupiedBy;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public  List<Skill> getSkillSet() {
        if (CollectionUtils.isEmpty(skillSet)) {
            skillSet = new ArrayList<Skill>();
        }
        return skillSet;
    }

}
