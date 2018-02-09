package com.test;

import com.alibaba.fastjson.JSONObject;
import com.yanlei.model.Qjw;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/applicationContext-service.xml")
public class CxfTest {

    @Test
    public void text1(){
        String s = WebClient.create("http://localhost:8081/services/webService/findQjwList")
                .accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println(s);
    }

    @Test
    public void text2(){
        Qjw qjw =new Qjw();
        qjw.setId(181);
        qjw.setDepartment("测试修改");
        qjw.setNumber(1L);
        qjw.setUpdatatime(new Date());

        Qjw qjw1 =new Qjw();
        qjw1.setId(182);
        qjw1.setDepartment("测试修改");
        qjw1.setNumber(2L);
        qjw1.setUpdatatime(new Date());
        List<Qjw> qjws = new ArrayList<Qjw>();
        qjws.add(qjw);
        qjws.add(qjw1);

        String s = WebClient.create("http://localhost:8081/services/webService/updateQjw")
                .accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).put(JSONObject.toJSONString(qjws),String.class);
        System.out.println(s);
    }
}
