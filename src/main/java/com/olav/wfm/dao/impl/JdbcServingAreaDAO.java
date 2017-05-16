package com.olav.wfm.dao.impl;

import com.olav.wfm.dao.ServingAreaDAO;
import com.olav.wfm.model.ServingArea;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Olga A on 13.05.2017.
 */
public class JdbcServingAreaDAO implements ServingAreaDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(ServingArea servingArea) {

    }

    public List<ServingArea> getAllServingAreas() {
        String sql = "SELECT * FROM SERVING_AREAS";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            List<ServingArea> servingAreaList = new ArrayList<ServingArea>();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                servingAreaList.add(new ServingArea(
                        rs.getString("serving_area_name"),
                        rs.getString("description")
                ));
//                System.out.println(rs.getString("resource_group_name") + ", " + rs.getString("description"));
            }
            rs.close();
            ps.close();
            return servingAreaList;

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
