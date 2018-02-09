package com.yanlei.controller;

import com.alibaba.fastjson.JSON;
import com.besjon.pojo.*;
import com.yanlei.model.*;
import com.yanlei.service.PeopleService;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 2 * @Author: xiayuanlei
 * 3 * @Date: 2018/1/22 10:03
 * 4
 */
@Controller
public class PeopleController {

    private static final Logger log = Logger.getLogger(PeopleController.class);

    @Autowired
    private PeopleService peopleService;

    @RequestMapping(value = "/showPeople", method = RequestMethod.GET,
            produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String showPeople(HttpServletResponse response, Model model){
        response.addHeader( "Access-Control-Allow-Origin", "*" );
        Sssj sssj = peopleService.findSssj();
        List<PeopleSex> list =peopleService.findPeopleSex();
        List<PeopleNation> list1 = peopleService.findPeopleNation();
        List<PeopleAge> list2 = peopleService.findPeopleAge();
        List<PeoplePolitical> list3 = peopleService.findPeoplePolitics();
        List<PeopleWork> list4 = peopleService.findPeopleWork();


        List<String> lists = new ArrayList<String>();
        lists.add(sssj.getColumn2()); //性别 民族 年龄 政治面貌 行业
        lists.add(sssj.getColumn3());
        lists.add(sssj.getColumn4());
        lists.add(sssj.getColumn5());
        lists.add(sssj.getColumn6());

        List<Fenlist1> fenlists= new ArrayList<Fenlist1>();
        for (int i = 0; i <list.size() ; i++) {
            Fenlist1 fenlist1 = new Fenlist1(list.get(i).getId(),list.get(i).getSex(),list.get(i).getProportion(),list.get(i).getPnumber());
            fenlists.add(fenlist1);
        }
        List<Fenlist1> fenlists1= new ArrayList<Fenlist1>();
        for (int i = 0; i <list1.size() ; i++) {
            Fenlist1 fenlist1 = new Fenlist1(list1.get(i).getId(),list1.get(i).getNation(),list1.get(i).getProportion(),list1.get(i).getNanumber());
            fenlists1.add(fenlist1);
        }
        List<Fenlist1> fenlists2= new ArrayList<Fenlist1>();
        for (int i = 0; i <list2.size() ; i++) {
            Fenlist1 fenlist1 = new Fenlist1(list2.get(i).getId(),list2.get(i).getAge(),list2.get(i).getProportion(),list2.get(i).getNumber());
            fenlists2.add(fenlist1);
        }
        List<Fenlist1> fenlists3= new ArrayList<Fenlist1>();
        for (int i = 0; i <list3.size() ; i++) {
            Fenlist1 fenlist1 = new Fenlist1(list3.get(i).getId(),list3.get(i).getPolitical(),list3.get(i).getProportion(),list3.get(i).getNumber());
            fenlists3.add(fenlist1);
        }
        List<Fenlist1> fenlists4= new ArrayList<Fenlist1>();
        for (int i = 0; i <list4.size() ; i++) {
            Fenlist1 fenlist1 = new Fenlist1(list4.get(i).getId(),list4.get(i).getWork(),list4.get(i).getProportion(),list4.get(i).getNumber());
            fenlists4.add(fenlist1);
        }

        List<Dlists1> dlistsList =new ArrayList<Dlists1>();
        Dlists1 dlists = new Dlists1();
        dlists.setFenlist(fenlists);
        Dlists1 dlists1 = new Dlists1();
        dlists1.setFenlist(fenlists1);
        Dlists1 dlists2 = new Dlists1();
        dlists2.setFenlist(fenlists2);
        Dlists1 dlists3 = new Dlists1();
        dlists3.setFenlist(fenlists3);
        Dlists1 dlists4 = new Dlists1();
        dlists4.setFenlist(fenlists4);

        dlistsList.add(dlists);
        dlistsList.add(dlists1);
        dlistsList.add(dlists2);
        dlistsList.add(dlists3);
        dlistsList.add(dlists4);

        List<FenData> fenDatas =new ArrayList<FenData>();
        for (int i = 0; i <list.size() ; i++) {
            FenData fenData = new FenData(list.get(i).getSex(),list.get(i).getPnumber());
            fenDatas.add(fenData);
        }
        List<FenData> fenDatas1 =new ArrayList<FenData>();
        for (int i = 0; i <list1.size() ; i++) {
            FenData fenData = new FenData(list1.get(i).getNation(),list1.get(i).getNanumber());
            fenDatas1.add(fenData);
        }
        List<FenData> fenDatas2 =new ArrayList<FenData>();
        for (int i = 0; i <list2.size() ; i++) {
            FenData fenData = new FenData(list2.get(i).getAge(),list2.get(i).getNumber());
            fenDatas2.add(fenData);
        }
        List<FenData> fenDatas3 =new ArrayList<FenData>();
        for (int i = 0; i <list3.size() ; i++) {
            FenData fenData = new FenData(list3.get(i).getPolitical(),list3.get(i).getNumber());
            fenDatas3.add(fenData);
        }
        List<FenData> fenDatas4 =new ArrayList<FenData>();
        for (int i = 0; i <list4.size() ; i++) {
            FenData fenData = new FenData(list4.get(i).getWork(),list4.get(i).getNumber());
            fenDatas4.add(fenData);
        }

        List<Colnum> colnumList =new ArrayList<Colnum>();
        Colnum colnum = new Colnum();
        colnum.setFenData(fenDatas);
        Colnum colnum1 = new Colnum();
        colnum1.setFenData(fenDatas1);
        Colnum colnum2 = new Colnum();
        colnum2.setFenData(fenDatas2);
        Colnum colnum3 = new Colnum();
        colnum3.setFenData(fenDatas3);
        Colnum colnum4 = new Colnum();
        colnum4.setFenData(fenDatas4);
        colnumList.add(colnum);
        colnumList.add(colnum1);
        colnumList.add(colnum2);
        colnumList.add(colnum3);
        colnumList.add(colnum4);

        JsonRootBean1 jsonRootBean =new JsonRootBean1();
        jsonRootBean.setLists(lists);
        jsonRootBean.setDlists(dlistsList);
        jsonRootBean.setColnums(colnumList);
        jsonRootBean.setLists1(sssj.getColumn1());
        return JSON.toJSONString(jsonRootBean);
    }

    @RequestMapping(value = "/showHavePeople" , method = RequestMethod.GET,
            produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String showHavePeople(HttpServletResponse response,Model model){
        response.addHeader( "Access-Control-Allow-Origin", "*" );

        List<SSRegion> ssRegions =peopleService.findRegion();
        List<SSIndustry> ssIndustries =peopleService.findIndustry();
        List<SSRevenue> ssRevenues =peopleService.findRevenue();
        List<SSWorkman> ssWorkmen =peopleService.findWorkman();
        List<SSMoney> ssMonies =peopleService.findMoney();
        Sssj sssj = peopleService.findSssj();

        List<String> lists = new ArrayList<String>();
        lists.add(sssj.getColumn8());
        lists.add(sssj.getColumn9());
        lists.add(sssj.getColumn10());
        lists.add(sssj.getColumn11());
        lists.add(sssj.getColumn12());

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

        List<String> list = new ArrayList<String>();
        list.add(sssj.getColumn1());
        list.add(sssj.getColumn7());
        list.add(sssj.getColumn13());
        list.add(sssj.getColumn14());
        list.add(sssj.getColumn15());

        JsonRootBean2 jsonRootBean =new JsonRootBean2();
        jsonRootBean.setLists(lists);
        jsonRootBean.setDlists(dlistsList);
        jsonRootBean.setLists1(list);
        return JSON.toJSONString(jsonRootBean);
    }



    /**
    * @Author: x
    * @Date: Created in 13:21 2018/2/5
     * 三实数据 图一修改接口
    */

    @RequestMapping(value = "/updatePeople" , method = RequestMethod.POST,
            produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600) //解决前端跨域问题
    public String updatePeople(HttpServletResponse response,
                               @RequestParam(value="file1") MultipartFile file) throws Exception {
        if (file == null) return null;
        response.addHeader("Access-Control-Allow-Origin", "*");
        String filename = file.getOriginalFilename();
       /* if (!filename.endsWith("xls") || !filename.endsWith("xlsx")) {
            log.error(filename + "不是excel文件");
            return null;
        }*/
        String filePath = "C:\\MultipartFile\\" + file.getOriginalFilename();
        long size = file.getSize();
        if (filename == null || ("").equals(filename) && size == 0) return null;

        File saveFile = new File(filePath);
        file.transferTo(saveFile);
        if (!saveFile.getParentFile().exists()) {
            saveFile.getParentFile().mkdirs();
        }
        Workbook wb = WorkbookFactory.create(new FileInputStream(saveFile));

        PeopleSex peopleSex =null;
        PeopleNation peopleNation = null;
        PeopleAge peopleAge = null;
        PeoplePolitical peoplePolitical = null;
        PeopleWork peopleWork = null;
        Sssj sssj = null;

        List<PeopleSex> peopleSexes = new ArrayList<PeopleSex>();
        List<PeopleNation> peopleNations = new ArrayList<PeopleNation>();
        List<PeopleAge> peopleAges = new ArrayList<PeopleAge>();
        List<PeoplePolitical> peoplePoliticals = new ArrayList<PeoplePolitical>();
        List<PeopleWork> peopleWorks = new ArrayList<PeopleWork>();
        Sssj sssj1 = peopleService.findSssj();

        for (int numSheet = 0; numSheet < wb.getNumberOfSheets(); numSheet++) {
            Sheet sheetAt = wb.getSheetAt(numSheet);
            if (sheetAt == null) {
                continue;
            }

            if (numSheet == 0) {
                Row row = sheetAt.getRow(0);
                if (row!=null){
                    String name = row.getCell(0).getStringCellValue();
                    //System.out.println(name);
                    if (!name.equals(sssj1.getColumn1())){
                        Sssj sssj2 = new Sssj();
                        sssj2.setColumn1(name);
                        sssj2.setId(1);
                        peopleService.updateSssj(sssj2);
                    }


                }
                //String sheetName = sheetAt.getSheetName(); 获得excel的sheet的名称
                for (int rowNum = 2; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        peopleSex = new PeopleSex();
                        peopleSex.setSex(hssfRow.getCell(0).getStringCellValue());//性别
                        long pnumber = Math.round(hssfRow.getCell(2).getNumericCellValue());//数量
                        peopleSex.setPnumber(pnumber);
                        long round = Math.round(hssfRow.getCell(1).getNumericCellValue());//百分比
                        String s = round+"";
                        double proportion = Double.parseDouble(s);
                        peopleSex.setProportion(proportion);
                        peopleSex.setId(rowNum - 1);
                        peopleSex.setUpdatetime(new Date());
                        peopleSexes.add(peopleSex);

                    }
                }
            } else if (numSheet == 1) {
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        peopleNation = new PeopleNation();
                        peopleNation.setNation(hssfRow.getCell(0).getStringCellValue());//民族
                        long pnumber = Math.round(hssfRow.getCell(2).getNumericCellValue());//数量
                        peopleNation.setNanumber(pnumber);
                        long round = Math.round(hssfRow.getCell(1).getNumericCellValue());//百分比
                        String s = round+"";
                        double proportion = Double.parseDouble(s);
                        peopleNation.setProportion(proportion);
                        peopleNation.setId(rowNum);
                        peopleNation.setUpdatetime(new Date());
                        peopleNations.add(peopleNation);
                    }
                }
            } else if (numSheet == 2) {
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        peopleAge = new PeopleAge();
                        peopleAge.setAge(hssfRow.getCell(0).getStringCellValue());//年龄
                        long pnumber = Math.round(hssfRow.getCell(2).getNumericCellValue());//数量
                        peopleAge.setNumber(pnumber);
                        long round = Math.round(hssfRow.getCell(1).getNumericCellValue());//百分比
                        String s = round+"";
                        double proportion = Double.parseDouble(s);
                        peopleAge.setProportion(proportion);
                        peopleAge.setId(rowNum);
                        peopleAge.setUpdatetime(new Date());
                        peopleAges.add(peopleAge);
                    }
                }
            } else if (numSheet == 3) {
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        peoplePolitical = new PeoplePolitical();
                        peoplePolitical.setPolitical(hssfRow.getCell(0).getStringCellValue());//政治面貌
                        long pnumber = Math.round(hssfRow.getCell(2).getNumericCellValue());//数量
                        peoplePolitical.setNumber(pnumber);
                        long round = Math.round(hssfRow.getCell(1).getNumericCellValue());//百分比
                        String s = round+"";
                        double proportion = Double.parseDouble(s);
                        peoplePolitical.setProportion(proportion);
                        peoplePolitical.setId(rowNum);
                        peoplePolitical.setUpdatetime(new Date());
                        peoplePoliticals.add(peoplePolitical);
                    }
                }
            } else if (numSheet == 4) {
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        peopleWork = new PeopleWork();
                        peopleWork.setWork(hssfRow.getCell(0).getStringCellValue());//行业
                        long pnumber = Math.round(hssfRow.getCell(2).getNumericCellValue());//数量
                        peopleWork.setNumber(pnumber);
                        long round = Math.round(hssfRow.getCell(1).getNumericCellValue());//百分比
                        String s = round+"";
                        double proportion = Double.parseDouble(s);
                        peopleWork.setProportion(proportion);
                        peopleWork.setId(rowNum);
                        peopleWork.setUpdatetime(new Date());
                        peopleWorks.add(peopleWork);
                    }
                }
            }else {

            }

        }

        if (!wb.getSheetAt(0).getSheetName().equals(sssj1.getColumn2()) || !wb.getSheetAt(1).getSheetName().equals(sssj1.getColumn3())
                || !wb.getSheetAt(2).getSheetName().equals(sssj1.getColumn4()) || !wb.getSheetAt(3).getSheetName().equals(sssj1.getColumn5())
                || !wb.getSheetAt(4).getSheetName().equals(sssj1.getColumn6())) {
            sssj = new Sssj();
            sssj.setColumn2(wb.getSheetAt(0).getSheetName());
            sssj.setColumn3(wb.getSheetAt(1).getSheetName());
            sssj.setColumn4(wb.getSheetAt(2).getSheetName());
            sssj.setColumn5(wb.getSheetAt(3).getSheetName());
            sssj.setColumn6(wb.getSheetAt(4).getSheetName());
            sssj.setId(1);
            int num = peopleService.updateSssj(sssj);
        }
        int result = peopleService.addSex(peopleSexes);
        int result1 = peopleService.addNation(peopleNations);
        int result2 = peopleService.addAge(peopleAges);
        int result3 = peopleService.addPolitical(peoplePoliticals);
        int result4 = peopleService.addWork(peopleWorks);
        if (result>0 && result1>0 && result2>0 && result3>0 && result4>0){
            return "success";
        }
        return "error";
    }


    /**
    * @Author: x
    * @Date: Created in 13:29 2018/2/9
     * 三实数据图二修改接口
    */
    @RequestMapping(value = "/updateHavePeople" , method = RequestMethod.POST,
            produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600) //解决前端跨域问题
    public String updateHavePeople(HttpServletResponse response,
                               @RequestParam(value="file2") MultipartFile file) throws Exception {
        if (file == null) return null;
        response.addHeader("Access-Control-Allow-Origin", "*");
        String filename = file.getOriginalFilename();
        String filePath = "C:\\MultipartFile\\" + file.getOriginalFilename();
        long size = file.getSize();
        if (filename == null || ("").equals(filename) && size == 0) return null;
        File saveFile = new File(filePath);
        file.transferTo(saveFile);
        if (!saveFile.getParentFile().exists()) {
            saveFile.getParentFile().mkdirs();
        }
        Workbook wb = WorkbookFactory.create(new FileInputStream(saveFile));

        SSRegion ssRegion = null;
        SSIndustry ssIndustry = null;
        SSRevenue ssRevenue = null;
        SSWorkman ssWorkman = null;
        SSMoney ssMoney = null;
        Sssj sssj = null;

        List<SSRegion> ssRegions = new ArrayList<SSRegion>();
        List<SSIndustry> ssIndustries = new ArrayList<SSIndustry>();
        List<SSRevenue> ssRevenues = new ArrayList<SSRevenue>();
        List<SSWorkman> ssWorkmens = new ArrayList<SSWorkman>();
        List<SSMoney> ssMonies = new ArrayList<SSMoney>();
        Sssj sssj1 = peopleService.findSssj();

        for (int numSheet = 0; numSheet < wb.getNumberOfSheets(); numSheet++) {
            Sheet sheetAt = wb.getSheetAt(numSheet);
            if (sheetAt == null) {
                continue;
            }

            if (numSheet == 0) {
                Row row = sheetAt.getRow(0);
                if (row != null) {
                    String name = row.getCell(0).getStringCellValue();
                    if (!name.equals(sssj1.getColumn7())) {
                        Sssj sssj2 = new Sssj();
                        sssj2.setColumn7(name);
                        sssj2.setId(1);
                        peopleService.updateSssj(sssj2);
                    }

                }
                //String sheetName = sheetAt.getSheetName(); 获得excel的sheet的名称
                for (int rowNum = 2; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        ssRegion = new SSRegion();
                        ssRegion.setRegion(hssfRow.getCell(0).getStringCellValue());//区域
                        long round = Math.round(hssfRow.getCell(1).getNumericCellValue());//百分比
                        String s = round + "";
                        double proportion = Double.parseDouble(s);
                        long pnumber = Math.round(hssfRow.getCell(2).getNumericCellValue());//数量
                        ssRegion.setNumber(pnumber);
                        ssRegion.setProportion(proportion);
                        ssRegion.setId(rowNum - 1);
                        //System.out.println(rowNum - 1);
                        ssRegion.setUpdatetime(new Date());
                        ssRegions.add(ssRegion);

                    }
                }
            } else if (numSheet == 1) {
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        ssIndustry = new SSIndustry();
                        ssIndustry.setIndustry(hssfRow.getCell(0).getStringCellValue());//行业
                        long round = Math.round(hssfRow.getCell(1).getNumericCellValue());//百分比
                        String s = round + "";
                        double proportion = Double.parseDouble(s);
                        long pnumber = Math.round(hssfRow.getCell(2).getNumericCellValue());//数量
                        ssIndustry.setNumber(pnumber);
                        ssIndustry.setProportion(proportion);
                        ssIndustry.setId(rowNum);
                        ssIndustry.setUpdatetime(new Date());
                        ssIndustries.add(ssIndustry);
                    }
                }
            } else if (numSheet == 2) {
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        ssRevenue = new SSRevenue();
                        ssRevenue.setRevenue(hssfRow.getCell(0).getStringCellValue());//税收
                        long round = Math.round(hssfRow.getCell(1).getNumericCellValue());//百分比
                        String s = round + "";
                        double proportion = Double.parseDouble(s);
                        long pnumber = Math.round(hssfRow.getCell(2).getNumericCellValue());//数量
                        ssRevenue.setNumber(pnumber);
                        ssRevenue.setProportion(proportion);
                        ssRevenue.setId(rowNum);
                        ssRevenue.setUpdatetime(new Date());
                        ssRevenues.add(ssRevenue);
                    }
                }
            } else if (numSheet == 3) {
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        ssWorkman = new SSWorkman();
                        ssWorkman.setWorker(hssfRow.getCell(0).getStringCellValue());//员工人数
                        long round = Math.round(hssfRow.getCell(1).getNumericCellValue());//百分比
                        String s = round + "";
                        double proportion = Double.parseDouble(s);
                        long pnumber = Math.round(hssfRow.getCell(2).getNumericCellValue());//数量
                        ssWorkman.setNumber(pnumber);
                        ssWorkman.setProportion(proportion);
                        ssWorkman.setId(rowNum);
                        ssWorkman.setUpdatetime(new Date());
                        ssWorkmens.add(ssWorkman);
                    }
                }
            } else if (numSheet == 4) {
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        ssMoney = new SSMoney();
                        ssMoney.setCapital(hssfRow.getCell(0).getStringCellValue());//员工人数
                        long round = Math.round(hssfRow.getCell(1).getNumericCellValue());//百分比
                        String s = round + "";
                        double proportion = Double.parseDouble(s);
                        long pnumber = Math.round(hssfRow.getCell(2).getNumericCellValue());//数量
                        ssMoney.setNumber(pnumber);
                        ssMoney.setProportion(proportion);
                        ssMoney.setId(rowNum);
                        ssMoney.setUpdatetime(new Date());
                        ssMonies.add(ssMoney);
                    }
                }
            } else {

            }

        }

        if (!wb.getSheetAt(0).getSheetName().equals(sssj1.getColumn8()) || !wb.getSheetAt(1).getSheetName().equals(sssj1.getColumn9())
                || !wb.getSheetAt(2).getSheetName().equals(sssj1.getColumn10()) || !wb.getSheetAt(3).getSheetName().equals(sssj1.getColumn11())
                || !wb.getSheetAt(4).getSheetName().equals(sssj1.getColumn12())) {
            sssj = new Sssj();
            sssj.setColumn8(wb.getSheetAt(0).getSheetName());
            sssj.setColumn9(wb.getSheetAt(1).getSheetName());
            sssj.setColumn10(wb.getSheetAt(2).getSheetName());
            sssj.setColumn11(wb.getSheetAt(3).getSheetName());
            sssj.setColumn12(wb.getSheetAt(4).getSheetName());
            sssj.setId(1);
            int num = peopleService.updateSssj(sssj);
        }
        int result = peopleService.addSSRegions(ssRegions);
        int result1 = peopleService.addSSIndustries(ssIndustries);
        int result2 = peopleService.addSSRevenues(ssRevenues);
        int result3 = peopleService.addSSWorkmens(ssWorkmens);
        int result4 = peopleService.addSSMonies(ssMonies);
        if (result > 0 && result1 > 0 && result2 > 0 && result3 > 0 && result4 > 0) {
            return "success";
        }
        return "error";
    }
}
