package com.yanlei.model;

import java.util.Date;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 13:58
 * 4
 */
public class PeopleSex {
   private Integer id;
   private String sex;
   private Long pnumber;
   private Double proportion;
   private Date updatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getPnumber() {
        return pnumber;
    }

    public void setPnumber(Long pnumber) {
        this.pnumber = pnumber;
    }

    public Double getProportion() {
        return proportion;
    }

    public void setProportion(Double proportion) {
        this.proportion = proportion;
    }

    public PeopleSex(Integer id, String sex, Long pnumber, Double proportion) {
        this.id = id;
        this.sex = sex;
        this.pnumber = pnumber;
        this.proportion = proportion;
    }

    public PeopleSex() {
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}
