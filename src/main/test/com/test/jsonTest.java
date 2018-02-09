package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
/*import com.yanlei.model.Dlists;
import com.yanlei.model.People;
import com.yanlei.model.ResponseDTO;
import com.yanlei.model.ResponseVo;*/
import com.yanlei.model.Qjw;
import com.yanlei.model.Qwb;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xiayaunlei
 * @date 2018/1/18 15:07
 */
public class jsonTest {

    @Test
    public void testMethod1(){
        List<String> lists = new ArrayList<String>();
        lists.add("区委办");
        lists.add("正委办法");
        lists.add("人委办");
        lists.add("才委办");
        lists.add("检委办");
        Object[] objects = lists.toArray();
        System.out.println(objects[0]);



        List<People> peoples1 = new ArrayList<People>();
        People people1 = new People("lilei",34,22343L);
        People people2 = new People("lilei",34,22343L);
        peoples1.add(people1);
        peoples1.add(people2);

        List<People> peoples2 = new ArrayList<People>();
        People people3 = new People("lilei",34,22343L);
        People people4 = new People("lilei",34,22343L);
        peoples2.add(people3);
        peoples2.add(people4);

        List<ResponseVo> Dlists = new ArrayList<ResponseVo>();
        ResponseVo responseVo1 = new ResponseVo();
        responseVo1.setFenlist(peoples1);
        ResponseVo responseVo2 = new ResponseVo();
        responseVo2.setFenlist(peoples2);
        Dlists.add(responseVo1);
        Dlists.add(responseVo2);

        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setLists(lists);
        responseDTO.setDlists(Dlists);

        System.out.println(JSON.toJSONString(responseDTO));
    }
}
