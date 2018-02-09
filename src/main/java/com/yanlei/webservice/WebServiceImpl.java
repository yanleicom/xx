package com.yanlei.webservice;


import com.alibaba.fastjson.JSON;
import com.yanlei.dao.PeopleFileDao;
import com.yanlei.dao.WebDao;
import com.yanlei.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: xiayuanlei
 * @Date: 2018/1/29 12:18
 */

@Service
@Transactional
/*@javax.jws.WebService(endpointInterface = "com.yanlei.webservice.WebService",serviceName = "peopleFile")*/
public class WebServiceImpl implements WebService {

    @Autowired
    private PeopleFileDao peopleFileDao;

    @Autowired
    private WebDao webDao;

    public PeopleFile findPeopleFileList() {
        PeopleFile peopleFileList = peopleFileDao.findPeopleFileList();
        return peopleFileList;
    }

    public int savePeopleFile(List<PeopleFile> peopleFileList) {
        for (PeopleFile peopleFile : peopleFileList) {
            peopleFileDao.savePeopleFile(peopleFile);
        }
        return peopleFileList.size();
    }

    public int updatePeople(List<PeopleFile> peopleFileList) {
        for (PeopleFile peopleFile : peopleFileList) {
            peopleFileDao.updatePeople(peopleFile);
        }
        return peopleFileList.size();
    }

    public int deletePeopleFile(Integer id) {
        System.out.println(id);
        return peopleFileDao.deletePeopleFile(id);
    }


    public List<Qjw> findQjwList() {
        List<Qjw> qjwList = webDao.findQjwList();
        return qjwList;
    }

    public int saveQjw(List<Qjw> qjws) {
        int i = 0;
        for (Qjw qjw : qjws) {
            i = webDao.saveQjw(qjw);
            i+=i;
        }

        if (i == qjws.size())
        return i;
        else
            return -1;
    }

    public int updateQjw(List<Qjw> qjws) {
        int i = 0;
        for (Qjw qjw : qjws) {
            i = webDao.updateQjw(qjw);
            i+=i;
        }

        if (i == qjws.size())
            return i;
        else
            return -1;
    }

    public int deletePeopleFile(List<Integer> ids) {
        return 0;
    }

    public List<Qwb> findQwbList() {
        return null;
    }

    public List<Qwb> saveQwb(List<Qwb> qwbs) {
        return null;
    }

    public int updateQwb(List<Qwb> qwbs) {
        return 0;
    }

    public int deleteQwb(List<Integer> ids) {
        return 0;
    }

    public List<Rlb> findRlbList() {
        return null;
    }

    public List<Rlb> saveRlb(List<Rlb> rlbs) {
        return null;
    }

    public int updateRlb(List<Rlb> rlbs) {
        return 0;
    }

    public int deleteRlb(List<Integer> ids) {
        return 0;
    }

    public List<Zfb> findZfbList() {
        return null;
    }

    public List<Zfb> saveZfb(List<Zfb> zfbs) {
        return null;
    }

    public int updateZfb(List<Zfb> zfbs) {
        return 0;
    }

    public int deleteZfb(List<Integer> ids) {
        return 0;
    }

    public List<Zx> findZxList() {
        return null;
    }

    public List<Zx> saveZx(List<Zx> zxs) {
        return null;
    }

    public int updateZx(List<Zx> zxs) {
        return 0;
    }

    public int deleteZx(List<Integer> ids) {
        return 0;
    }

    public int deleteQjw(List<Integer> ids) {
        return 0;
    }

}
