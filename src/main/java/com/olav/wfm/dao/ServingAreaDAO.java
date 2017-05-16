package com.olav.wfm.dao;

import com.olav.wfm.model.ServingArea;

import java.util.List;

/**
 * Created by Olga A on 13.05.2017.
 */
public interface ServingAreaDAO {

    public void insert(ServingArea servingArea);
    public List<ServingArea> getAllServingAreas();

}
