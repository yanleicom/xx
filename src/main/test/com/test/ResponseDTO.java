package com.test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiayaunlei
 * @date 2018/1/18 15:16
 */
public class ResponseDTO implements Serializable {


    private static final long serialVersionUID = -6321618969590817648L;

    private List<String> lists;

    private List<ResponseVo> Dlists;

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public List<ResponseVo> getDlists() {
        return Dlists;
    }

    public void setDlists(List<ResponseVo> dlists) {
        Dlists = dlists;
    }
}
