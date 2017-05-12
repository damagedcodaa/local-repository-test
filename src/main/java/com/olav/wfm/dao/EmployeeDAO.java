package com.olav.wfm.dao;

import com.olav.wfm.model.Employee;

import java.util.List;

/**
 * Created by Olga A on 12.05.2017.
 */
public interface EmployeeDAO {

    public void insert(Employee employee);
    public List<Employee> getAllEmployees();

}
