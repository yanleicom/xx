package com.yanlei.model;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.Date;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 15:48
 * 4
 */
public class PeopleWork {
    private Integer id;
    private String work;
    private Double proportion;
    private Long number;
    private Date updatetime;

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
