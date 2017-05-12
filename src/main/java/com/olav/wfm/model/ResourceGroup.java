package com.olav.wfm.model;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga A on 12.05.2017.
 */
public class ResourceGroup {

    String name;
    String description;
    List<ServingArea> servingAreaList;
    List<Skill> skillSet; //aggregate from all positions
    List<Position> positions;

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

    public  List<ServingArea> getServingAreaList() {
        if (CollectionUtils.isEmpty(servingAreaList)) {
            servingAreaList = new ArrayList<ServingArea>();
        }
        return servingAreaList;
    }

    public  List<Skill> getSkillSet() {
        if (CollectionUtils.isEmpty(skillSet)) {
            skillSet = new ArrayList<Skill>();
        }
        return skillSet;
    }

    public  List<Position> getPositions() {
        if (CollectionUtils.isEmpty(positions)) {
            positions = new ArrayList<Position>();
        }
        return positions;
    }

}
