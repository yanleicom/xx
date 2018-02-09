package com.yanlei.model;

import java.util.Date;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 15:47
 * 4
 */
public class PeoplePolitical {
    private Integer id;
    private String political;
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

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political;
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
