package com.yanlei.dao;

import com.yanlei.model.*;

import java.util.List;

public interface PeopleFileDao {
    PeopleFile findPeopleFileList();

    List<Qjw> findQjwList();

    List<Qwb> findQwbList();

    List<Rlb> findRlbList();

    List<Zfb> findZfbList();

    List<Zx> findZxList();

    int updatePeopleFile(PeopleFile peopleFile);

    int insertPeopleFile(PeopleFile peopleFile);

    int updateQjw(List<Qjw> qjw);

    //webservice测试
    int savePeopleFile(PeopleFile peopleFile);

    int deletePeopleFile(Integer id);

    int updatePeople(PeopleFile peopleFile);




    Fbm findFbm();

    int addQjw(Qjw qjw);

    void updateQjw(Qjw qjw);

    int addQwb(Qwb qwb);

    void updateQwb(Qwb qwb);

    int addZfb(Zfb zfb);

    void updateZfb(Zfb zfb);

    int addRlb(Rlb rlb);

    void updateRlb(Rlb rlb);

    int addZx(Zx zx);

    void updateZx(Zx zx);

    int updateFbm(Fbm fbm);
}
