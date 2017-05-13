package com.olav.wfm.dao.impl;

import com.olav.wfm.dao.ResourceGroupDAO;
import com.olav.wfm.model.ResourceGroup;

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
public class JdbcResourceGroupDAO implements ResourceGroupDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(ResourceGroup resourceGroup) {

    }

    public List<ResourceGroup> getAllResourceGroups() {
        String sql = "SELECT * FROM RESOURCE_GROUPS";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            List<ResourceGroup> resourceGroupList = new ArrayList<ResourceGroup>();

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                resourceGroupList.add(new ResourceGroup(
                        rs.getString("resource_group_name"),
                        rs.getString("description")
                ));
                System.out.println(rs.getString("resource_group_name") + ", " + rs.getString("description"));
            }
            rs.close();
            ps.close();
            return resourceGroupList;

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
