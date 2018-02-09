package com.yanlei.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

@XmlRootElement(name = "PeopleFile")
public class PeopleFile implements Serializable{
    private Integer id;
    private Long usenumber;
    private Long activenumber;
    private Long filenumber;
    private Long fileavg;
    private String filetime;
    private Long fileover;
    private Long filestart;
    private Date updatetime;
    private String column1;
    private String column2;
    private String column3;
    private String column4;
    private String column5;
    private String column6;
    private String column7;
    private String column8;

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

    public String getColumn5() {
        return column5;
    }

    public void setColumn5(String column5) {
        this.column5 = column5;
    }

    public String getColumn6() {
        return column6;
    }

    public void setColumn6(String column6) {
        this.column6 = column6;
    }

    public String getColumn7() {
        return column7;
    }

    public void setColumn7(String column7) {
        this.column7 = column7;
    }

    public String getColumn8() {
        return column8;
    }

    public void setColumn8(String column8) {
        this.column8 = column8;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUsenumber() {
        return usenumber;
    }

    public void setUsenumber(Long usenumber) {
        this.usenumber = usenumber;
    }

    public Long getActivenumber() {
        return activenumber;
    }

    public void setActivenumber(Long activenumber) {
        this.activenumber = activenumber;
    }

    public Long getFilenumber() {
        return filenumber;
    }

    public void setFilenumber(Long filenumber) {
        this.filenumber = filenumber;
    }

    public Long getFileavg() {
        return fileavg;
    }

    public void setFileavg(Long fileavg) {
        this.fileavg = fileavg;
    }

    public String getFiletime() {
        return filetime;
    }

    public void setFiletime(String filetime) {
        this.filetime = filetime;
    }

    public Long getFileover() {
        return fileover;
    }

    public void setFileover(Long fileover) {
        this.fileover = fileover;
    }

    public Long getFilestart() {
        return filestart;
    }

    public void setFilestart(Long filestart) {
        this.filestart = filestart;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "PeopleFile{" +
                "id=" + id +
                ", usenumber=" + usenumber +
                ", activenumber=" + activenumber +
                ", filenumber=" + filenumber +
                ", fileavg=" + fileavg +
                ", filetime='" + filetime + '\'' +
                ", fileover=" + fileover +
                ", filestart=" + filestart +
                ", updatetime=" + updatetime +
                ", column1='" + column1 + '\'' +
                ", column2='" + column2 + '\'' +
                ", column3='" + column3 + '\'' +
                ", column4='" + column4 + '\'' +
                ", column5='" + column5 + '\'' +
                ", column6='" + column6 + '\'' +
                ", column7='" + column7 + '\'' +
                ", column8='" + column8 + '\'' +
                '}';
    }
}
