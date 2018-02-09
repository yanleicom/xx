package com.yanlei.controller;

import com.alibaba.fastjson.JSON;
import com.besjon.pojo.*;
import com.yanlei.model.*;
import com.yanlei.service.PeopleFileService;
import com.yanlei.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/23 13:09
 * 4
 */
@Controller
public class StageController {

    @Autowired
    private PeopleService peopleService;
    //第四张图接口与第三张图接口相同
    @RequestMapping(value = "/showRegion" , method = RequestMethod.GET,
            produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String showRegion(HttpServletResponse response){
        response.addHeader( "Access-Control-Allow-Origin", "*" );

        List<SSRegion> ssRegions =peopleService.findRegion();
        List<SSIndustry> ssIndustries =peopleService.findIndustry();
        List<SSRevenue> ssRevenues =peopleService.findRevenue();
        List<SSWorkman> ssWorkmen =peopleService.findWorkman();
        List<SSMoney> ssMonies =peopleService.findMoney();
        Long sunNumber = peopleService.findRegionSum();

       // List<Long> total = new ArrayList<Long>();
       // total.add(sunNumber); //总事件数

        List<String> lists = new ArrayList<String>();
        lists.add("年");
        lists.add("月");
        lists.add("日");


        List<Fenlist2> fenlists = new ArrayList<Fenlist2>();
        for (int i = 0; i <ssRegions.size() ; i++) {
            Fenlist2 fenlist = new Fenlist2(ssRegions.get(i).getId(),ssRegions.get(i).getRegion(),ssRegions.get(i).getProportion(),ssRegions.get(i).getNumber());
            fenlists.add(fenlist);
        }
        List<Fenlist2> fenlists1= new ArrayList<Fenlist2>();
        for (int i = 0; i <ssIndustries.size() ; i++) {
            Fenlist2 fenlist = new Fenlist2(ssIndustries.get(i).getId(),ssIndustries.get(i).getIndustry(),ssIndustries.get(i).getProportion(),ssIndustries.get(i).getNumber());
            fenlists1.add(fenlist);
        }
        List<Fenlist2> fenlists2= new ArrayList<Fenlist2>();
        for (int i = 0; i <ssRevenues.size() ; i++) {
            Fenlist2 fenlist = new Fenlist2(ssRevenues.get(i).getId(),ssRevenues.get(i).getRevenue(),ssRevenues.get(i).getProportion(),ssRevenues.get(i).getNumber());
            fenlists2.add(fenlist);
        }
        List<Fenlist2> fenlists3= new ArrayList<Fenlist2>();
        for (int i = 0; i <ssWorkmen.size() ; i++) {
            Fenlist2 fenlist = new Fenlist2(ssWorkmen.get(i).getId(),ssWorkmen.get(i).getWorker(),ssWorkmen.get(i).getProportion(),ssWorkmen.get(i).getNumber());
            fenlists3.add(fenlist);
        }
        List<Fenlist2> fenlists4= new ArrayList<Fenlist2>();
        for (int i = 0; i <ssMonies.size() ; i++) {
            Fenlist2 fenlist = new Fenlist2(ssMonies.get(i).getId(),ssMonies.get(i).getCapital(),ssMonies.get(i).getProportion(),ssMonies.get(i).getNumber());
            fenlists4.add(fenlist);
        }

        List<Dlists2> dlistsList =new ArrayList<Dlists2>();
        Dlists2 dlists = new Dlists2();
        dlists.setFenlist(fenlists);
        Dlists2 dlists1 = new Dlists2();
        dlists1.setFenlist(fenlists1);
        Dlists2 dlists2 = new Dlists2();
        dlists2.setFenlist(fenlists2);
        Dlists2 dlists3 = new Dlists2();
        dlists3.setFenlist(fenlists3);
        Dlists2 dlists4 = new Dlists2();
        dlists4.setFenlist(fenlists4);
        dlistsList.add(dlists);
        dlistsList.add(dlists1);
        dlistsList.add(dlists2);
        dlistsList.add(dlists3);
        dlistsList.add(dlists4);

        JsonRootBean3 jsonRootBean =new JsonRootBean3();
        jsonRootBean.setLists(lists);
        jsonRootBean.setDlists(dlistsList);
        jsonRootBean.setTotal(sunNumber);
        return JSON.toJSONString(jsonRootBean);
    }
    @Autowired
    private PeopleFileService peopleFileService;

    @RequestMapping(value = "/showCation" , method = RequestMethod.GET,
            produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String showCation(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        List<PeoplePolitical> list = peopleService.findPeoplePolitics();
        List<SSMoney> ssMonies =peopleService.findMoney();
        List<Qjw> lists = peopleFileService.findQjwList();
        List<String> arr = new ArrayList<String>();
        List<Long> array = new ArrayList<Long>();

        for (int i = 0; i <lists.size() ; i++) {
            arr.add(lists.get(i).getDepartment());
        }
        for (int i = 0; i <lists.size() ; i++) {
            array.add(lists.get(i).getNumber());
        }

        List<Fenlist4> fenlist = new ArrayList<Fenlist4>();
        for (int i = 0; i <list.size() ; i++) {
            Fenlist4 fenlist4 = new Fenlist4(list.get(i).getId(),list.get(i).getPolitical(),list.get(i).getProportion().longValue());
            fenlist.add(fenlist4);
        }
        List<Fenlist4> fenlist1 = new ArrayList<Fenlist4>();
        for (int i = 0; i <ssMonies.size() ; i++) {
            Fenlist4 fenlist4 = new Fenlist4(ssMonies.get(i).getId(),ssMonies.get(i).getCapital(),ssMonies.get(i).getNumber());
            fenlist1.add(fenlist4);
        }

        List<Dlists4> dlists4s = new ArrayList<Dlists4>();
        Dlists4 dlists4 = new Dlists4();
        dlists4.setFenlist(fenlist);
        Dlists4 dlists5 = new Dlists4();
        dlists5.setFenlist(fenlist1);

        dlists4s.add(dlists4);
        dlists4s.add(dlists5);

        JsonRootBean4 jsonRootBean4 = new JsonRootBean4();
        jsonRootBean4.setLists(arr);
        jsonRootBean4.setLongList(array);
        jsonRootBean4.setDlists(dlists4s);
        return JSON.toJSONString(jsonRootBean4);
    }
}
