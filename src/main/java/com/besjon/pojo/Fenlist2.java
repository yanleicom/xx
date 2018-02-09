package com.besjon.pojo;

import java.io.Serializable;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 15:58
 * 4
 */
public class Fenlist2 implements Serializable {

    private Integer id;
    private String name;
    private Double percent;
    private Long num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Fenlist2(Integer id, String name, Double percent, Long num) {
        this.id = id;
        this.name = name;
        this.percent = percent;
        this.num = num;
    }
}
