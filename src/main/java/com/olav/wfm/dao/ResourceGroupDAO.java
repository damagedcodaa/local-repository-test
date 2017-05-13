package com.olav.wfm.dao;

import com.olav.wfm.model.ResourceGroup;

import java.util.List;

/**
 * Created by Olga A on 13.05.2017.
 */
public interface ResourceGroupDAO {

    public void insert(ResourceGroup resourceGroup);
    public List<ResourceGroup> getAllResourceGroups();

}
