
package com.besjon.pojo;
import java.io.Serializable;
import java.util.List;

/**
* @Author: xiayuanlei
* @Date: 2018/1/23 10:28
*/
public class JsonRootBean3 implements Serializable {

    private List<Dlists2> Dlists;
    private List<String> lists;
    private Long total;
    public List<Dlists2> getDlists() {
        return Dlists;
    }

    public void setDlists(List<Dlists2> dlists) {
        Dlists = dlists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }
    public List<String> getLists() {
        return lists;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }
}