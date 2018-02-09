
package com.besjon.pojo;
import java.io.Serializable;
import java.util.List;

/**
* @Author: xiayuanlei
* @Date: 2018/1/19 10:55
*/
public class JsonRootBean implements Serializable {

    private List<Dlists> Dlists;
    private List<String> lists;
    private String column1;
    private String column2;
    private String column3;
    private String column4;

    public void setDlists(List<Dlists> Dlists) {
        this.Dlists = Dlists;
    }
    public List<Dlists> getDlists() {
        return Dlists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }
    public List<String> getLists() {
        return lists;
    }

    public String getColumn1() {
        return column1;
    }

    public void setColumn1(String column1) {
        this.column1 = column1;
    }

    public String getColumn2() {
        return column2;
    }

    public void setColumn2(String column2) {
        this.column2 = column2;
    }

    public String getColumn3() {
        return column3;
    }

    public void setColumn3(String column3) {
        this.column3 = column3;
    }

    public String getColumn4() {
        return column4;
    }

    public void setColumn4(String column4) {
        this.column4 = column4;
    }
}