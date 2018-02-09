package com.besjon.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 17:07
 * 4
 */
public class JsonRootBean1 implements Serializable {
    private List<String> lists;
    private List<Dlists1> Dlists;
    private List<Colnum> colnums;
    private String lists1;
    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public List<Dlists1> getDlists() {
        return Dlists;
    }

    public void setDlists(List<Dlists1> dlists) {
        Dlists = dlists;
    }

    public List<Colnum> getColnums() {
        return colnums;
    }

    public void setColnums(List<Colnum> colnums) {
        this.colnums = colnums;
    }

    public String getLists1() {
        return lists1;
    }

    public void setLists1(String lists1) {
        this.lists1 = lists1;
    }
}
