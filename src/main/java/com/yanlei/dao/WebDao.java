package com.yanlei.dao;

import com.yanlei.model.Qjw;

import java.util.List;

public interface WebDao {
    List<Qjw> findQjwList();

    //int saveQjw(List<Qjw> qjws);

    int saveQjw(Qjw qjw);

    int updateQjw(Qjw qjw);
}
