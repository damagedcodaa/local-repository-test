package com.olav.wfm.model;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga A on 11.05.2017.
 */
public class Department {

    String title;
    List<Employee> employees;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public  List<Employee> getEmployees() {
        if (CollectionUtils.isEmpty(employees)) {
            employees = new ArrayList<Employee>();
        }
        return employees;
    }


}
