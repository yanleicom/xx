package com.yanlei.service;

import com.yanlei.model.*;

import java.util.List;

public interface PeopleFileService {
    PeopleFile findPeopleFileList();

    List<Qjw> findQjwList();

    List<Qwb> findQwbList();

    List<Rlb> findRlbList();

    List<Zfb> findZfbList();

    List<Zx> findZxList();

    int updatePeopleFile(PeopleFile peopleFile);

    Fbm findFbm();

    int addQjw(List<Qjw> qjws);

    int addQwb(List<Qwb> qwbs);

    int addZfb(List<Zfb> zfbs);

    int addRlb(List<Rlb> rlbs);

    int addZx(List<Zx> zxs);

    int updateFbm(Fbm fbm);
}
