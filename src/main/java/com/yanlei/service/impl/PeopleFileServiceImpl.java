package com.yanlei.service.impl;

import com.yanlei.dao.PeopleFileDao;
import com.yanlei.model.*;
import com.yanlei.service.PeopleFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PeopleFileServiceImpl implements PeopleFileService {

    @Autowired
    private PeopleFileDao PeopelFileDao;

    public PeopleFile findPeopleFileList() {
        return PeopelFileDao.findPeopleFileList();

    }

    public List<Qjw> findQjwList() {
        return PeopelFileDao.findQjwList();
    }

    public List<Qwb> findQwbList() {
        return PeopelFileDao.findQwbList();
    }

    public List<Rlb> findRlbList() {
        return PeopelFileDao.findRlbList();

    }

    public List<Zfb> findZfbList() {
        return PeopelFileDao.findZfbList();

    }

    public List<Zx> findZxList() {
        return PeopelFileDao.findZxList();
    }

    public int updatePeopleFile(PeopleFile peopleFile) {

        int num = PeopelFileDao.updatePeopleFile(peopleFile);
        if (num > 0) {
            peopleFile.setUpdatetime(new Date());
            PeopelFileDao.insertPeopleFile(peopleFile);
            return num;
        } else {
            return -1;
        }
    }


    public Fbm findFbm() {
        return PeopelFileDao.findFbm();
    }

    public int addQjw(List<Qjw> qjws) {
        int num = 0;
        for (Qjw qjw : qjws) {
            int i = PeopelFileDao.addQjw(qjw);
            num+=i;
        }
        if (num>0){
            for (Qjw qjw : qjws) {
                PeopelFileDao.updateQjw(qjw);
            }
        }
        return num;

    }

    public int addQwb(List<Qwb> qwbs) {
        int num = 0;
        for (Qwb qwb : qwbs) {
            int i = PeopelFileDao.addQwb(qwb);
            num+=i;
        }
        if (num>0){
            for (Qwb qwb : qwbs) {
                PeopelFileDao.updateQwb(qwb);
            }
        }
        return num;
    }

    public int addZfb(List<Zfb> zfbs) {
        int num = 0;
        for (Zfb zfb : zfbs) {
            int i = PeopelFileDao.addZfb(zfb);
            num+=i;
        }
        if (num>0){
            for (Zfb zfb : zfbs) {
                PeopelFileDao.updateZfb(zfb);
            }
        }
        return num;
    }

    public int addRlb(List<Rlb> rlbs) {
        int num = 0;
        for (Rlb rlb : rlbs) {
            int i = PeopelFileDao.addRlb(rlb);
            num+=i;
        }
        if (num>0){
            for (Rlb rlb : rlbs) {
                PeopelFileDao.updateRlb(rlb);
            }
        }
        return num;
    }

    public int addZx(List<Zx> zxs) {
        int num = 0;
        for (Zx zx : zxs) {
            int i = PeopelFileDao.addZx(zx);
            num+=i;
        }
        if (num>0){
            for (Zx zx : zxs) {
                PeopelFileDao.updateZx(zx);
            }
        }
        return num;
    }

    public int updateFbm(Fbm fbm) {
        return PeopelFileDao.updateFbm(fbm);
    }

}
