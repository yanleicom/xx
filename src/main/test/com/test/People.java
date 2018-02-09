package com.test;

import java.io.Serializable;

/**
 * @author xiayaunlei
 * @date 2018/1/18 15:12
 */
public class People implements Serializable {
    private static final long serialVersionUID = -3371006493380529237L;
    private String name;
    private Integer percent;
    private Long num;

    public People(String name, Integer percent, Long num) {
        this.name = name;
        this.percent = percent;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }
}
