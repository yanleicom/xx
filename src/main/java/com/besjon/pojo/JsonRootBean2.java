
package com.besjon.pojo;
import java.io.Serializable;
import java.util.List;

/**
* @Author: xiayuanlei
* @Date: 2018/1/23 10:28
*/
public class JsonRootBean2 implements Serializable {

    private List<Dlists2> Dlists;
    private List<String> lists;
    private List<String> lists1;
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

    public List<String> getLists1() {
        return lists1;
    }

    public void setLists1(List<String> lists1) {
        this.lists1 = lists1;
    }
}