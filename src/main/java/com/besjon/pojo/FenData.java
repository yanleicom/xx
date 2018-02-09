package com.besjon.pojo;

import java.io.Serializable;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 19:33
 * 4
 */
public class FenData  implements Serializable {
    private String name;
    private Long value;

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

    public FenData(String name, Long value) {
        this.name = name;
        this.value = value;
    }
}
