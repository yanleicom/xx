package com.yanlei.controller;

import com.alibaba.fastjson.JSON;
import com.besjon.pojo.Fenlist4;
import com.yanlei.model.SSMoney;
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
 * 3 * @Date: 2018/1/23 16:46
 * 4
 */
@Controller
public class HandleController {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/showHandleFile" , method = RequestMethod.GET,
            produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String showHandleFile(HttpServletResponse response) {
        response.addHeader( "Access-Control-Allow-Origin", "*" );

        List<SSMoney> ssMonies =peopleService.findMoney();

        List<Fenlist4> fenlist1 = new ArrayList<Fenlist4>();
        for (int i = 0; i <ssMonies.size() ; i++) {
            Fenlist4 fenlist4 = new Fenlist4(ssMonies.get(i).getId(),ssMonies.get(i).getCapital(),ssMonies.get(i).getNumber());
            fenlist1.add(fenlist4);
        }

        return JSON.toJSONString(fenlist1);
    }

}
