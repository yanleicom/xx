package com.yanlei.service;

import com.yanlei.model.*;

import java.util.List;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 10:21
 * 4
 */
public interface PeopleService {
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

      //三实数据的column查询

/**
* @Author: x
* @Date: Created in 16:39 2018/2/5
* 实有人口数据的增加和修改
*/
    
    Sssj findSssj();

    int updateSssj(Sssj sssj);//修改三实数据的column

    int addSex(List<PeopleSex> peopleSexes);

    int addNation(List<PeopleNation> peopleNations);

    int addAge(List<PeopleAge> peopleAges);

    int addPolitical(List<PeoplePolitical> peoplePoliticals);

    int addWork(List<PeopleWork> peopleWorks);

    int addSSRegions(List<SSRegion> ssRegions);

    int addSSIndustries(List<SSIndustry> ssIndustries);

    int addSSRevenues(List<SSRevenue> ssRevenues);

    int addSSWorkmens(List<SSWorkman> ssWorkmens);

    int addSSMonies(List<SSMoney> ssMonies);
}
