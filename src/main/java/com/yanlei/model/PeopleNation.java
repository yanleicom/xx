package com.yanlei.model;

import java.util.Date;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 15:18
 * 4
 */
public class PeopleNation {
    private Integer id;
    private String nation;
    private Long nanumber;
    private Double proportion;
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

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public Long getNanumber() {
        return nanumber;
    }

    public void setNanumber(Long nanumber) {
        this.nanumber = nanumber;
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }
}
