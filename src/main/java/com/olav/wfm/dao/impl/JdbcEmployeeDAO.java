package com.olav.wfm.dao.impl;

import com.olav.wfm.dao.EmployeeDAO;
import com.olav.wfm.model.Employee;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga A on 12.05.2017.
 */
public class JdbcEmployeeDAO implements EmployeeDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(Employee employee) {

    }

    public List<Employee> getAllEmployees() {

        String sql = "SELECT * FROM EMPLOYEES";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            List<Employee> employeesList = new ArrayList<Employee>();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                employeesList.add(new Employee(
                        rs.getString("name"),
                        rs.getString("surname")
                        ));
                System.out.println(rs.getString("name") + ", " + rs.getString("surname"));
            }
            rs.close();
            ps.close();
            return employeesList;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
