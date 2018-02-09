package com.yanlei.service.impl;

import com.yanlei.dao.PeopleDao;
import com.yanlei.model.*;
import com.yanlei.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 10:22
 * 4
 */
@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    private PeopleDao peopleDao;

    public List<PeopleSex> findPeopleSex() {
        return peopleDao.findPeopleSex();
    }

    public int findManNubmer() {
        return peopleDao.findManNubmer();
    }

    public PeopleSex findPeopleNumber() {
        return peopleDao.findPeopleNumber();
    }

    public List<PeopleNation> findPeopleNation() {
        return peopleDao.findPeopleNation();
    }

    public List<PeopleAge> findPeopleAge() {
        return peopleDao.findPeopleAge();

    }

    public List<PeoplePolitical> findPeoplePolitics() {
        return peopleDao.findPeoplePolitics();
    }

    public List<PeopleWork> findPeopleWork() {
        return peopleDao.findPeopleWork();
    }

    public List<SSRegion> findRegion() {
        return peopleDao.findRegion();
    }

    public List<SSIndustry> findIndustry() {
        return peopleDao.findIndustry();

    }

    public List<SSRevenue> findRevenue() {
        return peopleDao.findRevenue();
    }

    public List<SSWorkman> findWorkman() {
        return peopleDao.findWorkman();
    }

    public List<SSMoney> findMoney() {
        return peopleDao.findMoney();

    }

    public Long findRegionSum() {
        return peopleDao.findRegionSum();
    }

    public Sssj findSssj() {
        return peopleDao.findSssj();
    }

    public int updateSssj(Sssj sssj) {
        return peopleDao.updateSssj(sssj);
    }



    /**
    * @Author: x
    * @Date: Created in 19:01 2018/2/8
     * 三实数据的添加和修改
    */
    public int addSex(List<PeopleSex> peopleSexes) {
        int num = 0;
        for (PeopleSex peopleSex : peopleSexes) {
            num = peopleDao.addSex(peopleSex);
            num+=num;
        }
        if (num ==peopleSexes.size()){
            for (PeopleSex peopleSex : peopleSexes) {
                peopleDao.updateSex(peopleSex);
            }
        }
        return num;
    }

    public int addNation(List<PeopleNation> peopleNations) {
        int num = 0;
        for (PeopleNation peopleNation : peopleNations) {
            num = peopleDao.addNation(peopleNation);
            num+=num;
        }
        if (num == peopleNations.size()){
            for (PeopleNation peopleNation : peopleNations) {
                peopleDao.updateNation(peopleNation);
            }
        }
        return num;
    }

    public int addAge(List<PeopleAge> peopleAges) {
        int num = 0;
        for (PeopleAge peopleAge : peopleAges) {
            num = peopleDao.addAge(peopleAge);
            num+=num;
        }
        if (num == peopleAges.size()){
            for (PeopleAge peopleAge : peopleAges) {
                num = peopleDao.updatAge(peopleAge);
            }
        }
        return num;
    }

    public int addPolitical(List<PeoplePolitical> peoplePoliticals) {
        int num = 0;
        for (PeoplePolitical peoplePolitical : peoplePoliticals) {
            num = peopleDao.addPolitical(peoplePolitical);
            num+=num;
        }
        if (num == peoplePoliticals.size()){
            for (PeoplePolitical peoplePolitical : peoplePoliticals) {
                num = peopleDao.updatPolitical(peoplePolitical);
            }
        }
        return num;
    }

    public int addWork(List<PeopleWork> peopleWorks) {
        int num = 0;
        for (PeopleWork peopleWork : peopleWorks) {
            num = peopleDao.addWork(peopleWork);
            num+=num;
        }
        if (num == peopleWorks.size()){
            for (PeopleWork peopleWork : peopleWorks) {
                num = peopleDao.updatWork(peopleWork);
            }
        }
        return num;
    }

    /**
    * @Author: x
    * @Date: Created in 13:57 2018/2/9
     * 三实数据图二可配置修改
    */
    public int addSSRegions(List<SSRegion> ssRegions) {
        int num = 0;
        for (SSRegion ssRegion : ssRegions) {
            num = peopleDao.addSSRegions(ssRegion);
            num+=num;
        }
        if (num > 0){
            for (SSRegion ssRegion : ssRegions) {
                peopleDao.updateSSRegions(ssRegion);
            }
        }
        return num;
    }

    public int addSSIndustries(List<SSIndustry> ssIndustries) {
        int num = 0;
        for (SSIndustry ssIndustry : ssIndustries) {
            num = peopleDao.addSSIndustries(ssIndustry);
            num+=num;
        }
        if (num > 0){
            for (SSIndustry ssIndustry : ssIndustries) {
                peopleDao.updateSSIndustries(ssIndustry);
            }
        }
        return num;
    }

    public int addSSRevenues(List<SSRevenue> ssRevenues) {
        int num = 0;
        for (SSRevenue ssRevenue : ssRevenues) {
            num = peopleDao.addSSRevenues(ssRevenue);
            num+=num;
        }
        if (num > 0){
            for (SSRevenue ssRevenue : ssRevenues) {
                peopleDao.updateSSRevenues(ssRevenue);
            }
        }
        return num;
    }

    public int addSSWorkmens(List<SSWorkman> ssWorkmens) {
        int num = 0;
        for (SSWorkman ssWorkman : ssWorkmens) {
            num = peopleDao.addSSWorkmens(ssWorkman);
            num+=num;
        }
        if ( num > 0){
            for (SSWorkman ssWorkman : ssWorkmens) {
                peopleDao.updateSSWorkmens(ssWorkman);
            }
        }
        return num;
    }

    public int addSSMonies(List<SSMoney> ssMonies) {
        int num = 0;
        for (SSMoney ssMoney : ssMonies) {
            num = peopleDao.addSSMonies(ssMoney);
            num+=num;
        }
        if (num > 0){
            for (SSMoney ssMoney : ssMonies) {
                peopleDao.updateSSMonies(ssMoney);
            }
        }
        return num;
    }

}
