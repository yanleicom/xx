package com.yanlei.test;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.yanlei.model.PeopleFile;
import com.yanlei.model.Qjw;
import com.yanlei.model.Qwb;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.log4j.Logger;

import javax.websocket.server.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @Author: xiayuanlei
 * @Date: 2018/1/29 18:49
 */
public class RSTest {
    private static final Logger log = Logger.getLogger(RSTest.class);
    public static void main(String[] args) {
       /* String s = WebClient.create("http://192.168.0.111:8081/services/webService/peopleFile")
                .accept(MediaType.APPLICATION_JSON).get(String.class);//查询操作
        log.info("有没有定西啊"+s);
        System.out.println(s);*/
      /*  Collection<? extends Qjw> collection = WebClient.create("http://localhost:8081/services/webService/findQjwList")
                .accept(MediaType.APPLICATION_JSON).getCollection(Qjw.class);
        System.out.println(collection);*/
      /*PeopleFile peopleFile1 =new PeopleFile();
      peopleFile1.setUpdatetime(new Date());
      peopleFile1.setActivenumber(888L);
      peopleFile1.setId(24);
        PeopleFile peopleFile2 =new PeopleFile();
        peopleFile2.setUpdatetime(new Date());
        peopleFile2.setActivenumber(999L);
        peopleFile2.setId(25);
      List<PeopleFile> list =new ArrayList<PeopleFile>();
      list.add(peopleFile1);
      list.add(peopleFile2);
      Response put = WebClient.create("http://localhost:8081/services/webService/updatePeople")
              .accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).put(JSONObject.toJSONString(list));
      System.out.println(put);*/

        String s = WebClient.create("http://localhost:8081/services/webService/findQjwList")
                .accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).get(String.class);
        System.out.println(s);
    }

}
