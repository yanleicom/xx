package com.yanlei.dao;

import com.yanlei.model.*;

import java.util.List;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 10:48
 * 4
 */
public interface PeopleDao {
    List<PeopleSex> findPeopleSex();

    int findManNubmer();

    PeopleSex findPeopleNumber();

    List<PeopleNation> findPeopleNation();

    List<PeopleAge> findPeopleAge();

    List<PeoplePolitical> findPeoplePolitics();

    List<PeopleWork> findPeopleWork();

    List<SSRegion> findRegion();

    List<SSIndustry> findIndustry();

    List<SSRevenue> findRevenue();

    List<SSWorkman> findWorkman();

    List<SSMoney> findMoney();

    Long findRegionSum();

    Sssj findSssj();

    int updateSssj(Sssj sssj);


    /**
    * @Author: x
    * @Date: Created in 19:04 2018/2/8
     * 三实数据的添加和修改
    */

    int addSex(PeopleSex peopleSex);

    void updateSex(PeopleSex peopleSex);

    int addNation(PeopleNation peopleNation);

    void updateNation(PeopleNation peopleNation);

    int addAge(PeopleAge peopleAge);

    int updatAge(PeopleAge peopleAge);

    int addPolitical(PeoplePolitical peoplePolitical);

    int updatPolitical(PeoplePolitical peoplePolitical);

    int addWork(PeopleWork peopleWork);

    int updatWork(PeopleWork peopleWork);


    /**
    * @Author: x
    * @Date: Created in 14:05 2018/2/9
     * 三实数据图二可配置修改
    */

    int addSSRegions(SSRegion ssRegion);

    int addSSIndustries(SSIndustry ssIndustry);

    int addSSRevenues(SSRevenue ssRevenue);

    int addSSWorkmens(SSWorkman ssWorkman);

    int addSSMonies(SSMoney ssMoney);

    void updateSSRegions(SSRegion ssRegion);

    void updateSSIndustries(SSIndustry ssIndustry);

    void updateSSRevenues(SSRevenue ssRevenue);

    void updateSSWorkmens(SSWorkman ssWorkman);

    void updateSSMonies(SSMoney ssMoney);
}
