
package com.besjon.pojo;

import java.io.Serializable;

/**
* @Author: xiayuanlei
* @Date: 2018/1/19 10:56
*/
public class Fenlist4 implements Serializable{

    private Integer id;
    private String name;
    private Long value;

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

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Fenlist4(Integer id, String name, Long value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }
}