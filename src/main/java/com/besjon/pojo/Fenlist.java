
package com.besjon.pojo;

import java.io.Serializable;

/**
* @Author: xiayuanlei
* @Date: 2018/1/19 10:56
*/
public class Fenlist implements Serializable{
    private Integer id;
    private String bumen;
    private Long num;


    public void setBumen(String bumen) {
        this.bumen = bumen;
    }
    public String getBumen() {
        return bumen;
    }

    public void setNum(Long num) {
        this.num = num;
    }
    public Long getNum() {
        return num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Fenlist(Integer id, String bumen, Long num) {
        this.id = id;
        this.bumen = bumen;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Fenlist{" +
                "bumen='" + bumen + '\'' +
                ", num=" + num +
                '}';
    }
}