package com.yanlei.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.besjon.pojo.Dlists;
import com.besjon.pojo.Fenlist;
import com.besjon.pojo.JsonRootBean;
import com.yanlei.model.*;
import com.yanlei.service.PeopleFileService;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: xiayuanlei
 * @Date: 2018/1/18 17:34
 */


@Controller
public class PeopleFileController {

    private static final Logger logger = Logger.getLogger(PeopleFileController.class);

    @Autowired
    private PeopleFileService peopleFileService;

    @RequestMapping(value = "/showPeopleFile", method = RequestMethod.GET,
            produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String showLeftIndex( HttpServletResponse response, HttpServletRequest request
            /*, @RequestParam("callback")String callback*/ ){
        response.addHeader( "Access-Control-Allow-Origin", "*" );

        PeopleFile peopleFile = peopleFileService.findPeopleFileList();
        if (peopleFile!= null){
            return JSONObject.toJSONString(peopleFile);
        }else{
            logger.info("数据返回失败");
            return "error";
        }

    }
    //第四个图接口与第一个图接口相同
    @RequestMapping(value = "/showDapartmentNumber", method = RequestMethod.GET,
            produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String showRigthIndex(HttpServletResponse response) {
        response.addHeader( "Access-Control-Allow-Origin", "*" );
        List<Qjw> list = peopleFileService.findQjwList();
        List<Qwb> list1 = peopleFileService.findQwbList();
        List<Rlb> list2 = peopleFileService.findRlbList();
        List<Zfb> list3 = peopleFileService.findZfbList();
        List<Zx> list4 = peopleFileService.findZxList();
        Fbm fbm = peopleFileService.findFbm();
        if (list.size()!=0 && list1.size()!=0 && list2.size()!=0 && list3.size()!=0 && list4.size()!=0){
            List<String> lists = new ArrayList<String>();
            lists.add(fbm.getColumn2());
            lists.add(fbm.getColumn3());
            lists.add(fbm.getColumn4());
            lists.add(fbm.getColumn5());
            lists.add(fbm.getColumn6());

            List<Fenlist> fenlists= new ArrayList<Fenlist>();
            for (int i = 0; i < list.size(); i++) {
                Fenlist fenlist = new Fenlist(list.get(i).getId(),list.get(i).getDepartment(),list.get(i).getNumber());
                fenlists.add(fenlist);
            }
            List<Fenlist> fenlists1= new ArrayList<Fenlist>();
            for (int i = 0; i < list1.size(); i++) {
                Fenlist fenlist = new Fenlist(list1.get(i).getId(),list1.get(i).getDepartment(),list1.get(i).getNumber());
                fenlists1.add(fenlist);
            }
            List<Fenlist> fenlists2= new ArrayList<Fenlist>();
            for (int i = 0; i < list2.size(); i++) {
                Fenlist fenlist = new Fenlist(list2.get(i).getId(),list2.get(i).getDepartment(),list2.get(i).getNumber());
                fenlists2.add(fenlist);
            }
            List<Fenlist> fenlists3= new ArrayList<Fenlist>();
            for (int i = 0; i < list3.size(); i++) {
                Fenlist fenlist = new Fenlist(list3.get(i).getId(),list3.get(i).getDepartment(),list3.get(i).getNumber());
                fenlists3.add(fenlist);
            }
            List<Fenlist> fenlists4= new ArrayList<Fenlist>();
            for (int i = 0; i < list4.size(); i++) {
                Fenlist fenlist = new Fenlist(list4.get(i).getId(),list4.get(i).getDepartment(),list4.get(i).getNumber());
                fenlists4.add(fenlist);
            }

            List<Dlists> dlistsList =new ArrayList<Dlists>();
            Dlists dlists =new Dlists();
            dlists.setFenlist(fenlists);
            Dlists dlists1 =new Dlists();
            dlists1.setFenlist(fenlists1);
            Dlists dlists2 =new Dlists();
            dlists2.setFenlist(fenlists2);
            Dlists dlists3 =new Dlists();
            dlists3.setFenlist(fenlists3);
            Dlists dlists4 =new Dlists();
            dlists4.setFenlist(fenlists4);
            dlistsList.add(dlists);
            dlistsList.add(dlists1);
            dlistsList.add(dlists2);
            dlistsList.add(dlists3);
            dlistsList.add(dlists4);

            JsonRootBean jsonRootBean =new JsonRootBean();
            jsonRootBean.setLists(lists);
            jsonRootBean.setDlists(dlistsList);
            jsonRootBean.setColumn1(fbm.getColumn1());
            jsonRootBean.setColumn2(fbm.getColumn7());
            jsonRootBean.setColumn3(fbm.getColumn8());
            jsonRootBean.setColumn4(fbm.getColumn9());
            logger.info("数据返回成功");
            return JSON.toJSONString(jsonRootBean);
        }else {
            logger.info("数据返回失败");
            return "error";
        }
    }
/**
 * @Author: xiayuanlei
 * @Date: 2018/1/29 9:44
 */

    @RequestMapping(value = "/updatePeopleFile", produces = "text/json;charset=UTF-8")
    @ResponseBody
    public String updatePeopleFile(HttpServletResponse response,PeopleFile peopleFile,Model model) {
        response.addHeader( "Access-Control-Allow-Origin", "*" );

        System.out.println( peopleFile.getColumn1()+ peopleFile.getUsenumber() + peopleFile.getActivenumber());

        int num = peopleFileService.updatePeopleFile(peopleFile);
        if (num > 0){
            model.addAttribute("success",num);
            return "success";
        }
        return "error";
    }

    //excel文件上传解析插入数据库
    @RequestMapping(value = "/updateQjw", produces = "text/json;charset=UTF-8")
    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600) //解决前端跨域问题
    public String updateQjw(HttpServletResponse response, HttpServletRequest request, @RequestParam(value="file") MultipartFile file) throws IOException, InvalidFormatException {

        if(file==null) return null;
       /* String filename = file.getOriginalFilename();
        if (!filename.endsWith("xls") || !filename.endsWith("xlsx")){
            logger.error(filename + "不是excel文件");
            return null;
        }*/
        String filePath = "C:\\MultipartFile\\" + file.getOriginalFilename();
        //String filePath = request.getSession().getServletContext().getRealPath("\\upload")+ file.getOriginalFilename();
        String filename = file.getOriginalFilename();
        //System.out.println(filename);
        long size=file.getSize();
       // System.out.println(size);
        if(filename==null || ("").equals(filename) && size==0) return null;

        File saveFile = new File(filePath);
        file.transferTo(saveFile);
        if (!saveFile.getParentFile().exists()) {
            saveFile.getParentFile().mkdirs();
        }

        List<Qwb> qwbs = new ArrayList<Qwb>();
        List<Zfb> zfbs = new ArrayList<Zfb>();
        List<Rlb> rlbs = new ArrayList<Rlb>();
        List<Qjw> qjws = new ArrayList<Qjw>();
        List<Zx> zxs = new ArrayList<Zx>();

        Qwb qwb = null;
        Zfb zfb =null;
        Rlb rlb = null;
        Qjw qjw = null;
        Zx zx = null;
        // 1、 加载Excel文件对象2003 2007都可以
        Workbook wb = WorkbookFactory.create(new FileInputStream(saveFile));
        // 2、 读取一个sheet
        //Sheet sheetAt1 = wb.getSheetAt(0);
        //String sheetName = sheetAt1.getSheetName();
        //System.out.println(sheetName);
        for (int numSheet = 0; numSheet < wb.getNumberOfSheets(); numSheet++) {
            Sheet sheetAt = wb.getSheetAt(numSheet);
            if (sheetAt == null) {
                continue;
            }
            if (numSheet == 0) {
                // 循环行Row
               /* Row row = sheetAt.getRow(0);
                Cell cell = row.getCell(1);
                Cell cell2 = row.getCell(2);
                Cell cell3 = row.getCell(3);
                if (!cell.equals("排名") || !cell2.equals("部门名称") || !cell3.equals("办件数"))*/
                //String sheetName = sheetAt.getSheetName(); 获得excel的sheet的名称
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {
                        qwb = new Qwb();

                        qwb.setDepartment(hssfRow.getCell(1).getStringCellValue());
                        long number = Math.round(hssfRow.getCell(2).getNumericCellValue());
                        qwb.setNumber(number);
                        qwb.setUpdatatime(new Date());
                        long id = Math.round(hssfRow.getCell(0).getNumericCellValue());
                        qwb.setId(Integer.parseInt(id+""));
                        qwbs.add(qwb);
                    }
                }
            }else if (numSheet == 1){
                // 循环行Row
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {

                        zfb = new Zfb();

                        zfb.setDepartment(hssfRow.getCell(1).getStringCellValue());
                        long number = Math.round(hssfRow.getCell(2).getNumericCellValue());
                        zfb.setNumber(number);
                        zfb.setUpdatatime(new Date());
                        //zfb.setId(rowNum);
                        long id = Math.round(hssfRow.getCell(0).getNumericCellValue());
                        zfb.setId(Integer.parseInt(id+""));
                        zfbs.add(zfb);
                    }
                }
            }else if (numSheet == 2){
                // 循环行Row
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {

                        rlb = new Rlb();

                        rlb.setDepartment(hssfRow.getCell(1).getStringCellValue());
                        long number = Math.round(hssfRow.getCell(2).getNumericCellValue());
                        rlb.setNumber(number);
                        rlb.setUpdatatime(new Date());
                        //rlb.setId(rowNum);
                        long id = Math.round(hssfRow.getCell(0).getNumericCellValue());
                        rlb.setId(Integer.parseInt(id+""));
                        rlbs.add(rlb);
                    }
                }
            }else if (numSheet == 3){
                // 循环行Row
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {

                        qjw = new Qjw();

                        qjw.setDepartment(hssfRow.getCell(1).getStringCellValue());
                        long number = Math.round(hssfRow.getCell(2).getNumericCellValue());
                        qjw.setNumber(number);
                        qjw.setUpdatatime(new Date());
                        long id = Math.round(hssfRow.getCell(0).getNumericCellValue());
                        qjw.setId(Integer.parseInt(id+""));
                        //qjw.setId(rowNum);
                        qjws.add(qjw);
                    }
                }
            }else if (numSheet == 4){
                // 循环行Row
                for (int rowNum = 1; rowNum <= sheetAt.getLastRowNum(); rowNum++) {
                    Row hssfRow = sheetAt.getRow(rowNum);
                    if (hssfRow != null) {

                        zx = new Zx();

                        zx.setDepartment(hssfRow.getCell(1).getStringCellValue());
                        long number = Math.round(hssfRow.getCell(2).getNumericCellValue());
                        zx.setNumber(number);
                        zx.setUpdatatime(new Date());
                        //zx.setId(rowNum);
                        long id = Math.round(hssfRow.getCell(0).getNumericCellValue());
                        zx.setId(Integer.parseInt(id+""));
                        zxs.add(zx);
                    }
                }
            }else {

            }

        }
        Fbm fbm1 = peopleFileService.findFbm();
        if (!wb.getSheetAt(0).getSheetName().equals(fbm1.getColumn2()) || !wb.getSheetAt(1).getSheetName().equals(fbm1.getColumn3())
                ||!wb.getSheetAt(2).getSheetName().equals(fbm1.getColumn4()) ||!wb.getSheetAt(3).getSheetName().equals(fbm1.getColumn5())
                ||!wb.getSheetAt(4).getSheetName().equals(fbm1.getColumn6())){
            Fbm fbm = new Fbm();
            fbm.setColumn2(wb.getSheetAt(0).getSheetName());
            fbm.setColumn3(wb.getSheetAt(1).getSheetName());
            fbm.setColumn4(wb.getSheetAt(2).getSheetName());
            fbm.setColumn5(wb.getSheetAt(3).getSheetName());
            fbm.setColumn6(wb.getSheetAt(4).getSheetName());
            fbm.setId(1);
            int num5 = peopleFileService.updateFbm(fbm);
        }
        int num = peopleFileService.addQwb(qwbs);
        int num1 = peopleFileService.addZfb(zfbs);
        int num2 = peopleFileService.addRlb(rlbs);
        int num3 = peopleFileService.addQjw(qjws);
        int num4 = peopleFileService.addZx(zxs);
        if (num>0 && num1>0 && num2>0 && num3>0 && num4>0){
            return "success";
        }
        return "error";
    }
}
