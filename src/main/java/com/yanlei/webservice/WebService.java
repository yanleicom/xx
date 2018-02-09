package com.yanlei.webservice;



import com.yanlei.model.*;

import javax.ws.rs.*;
import java.util.List;


@Produces("*/*")
public interface WebService {

    @GET
    @Path("/peopleFile")
    @Produces({ "application/json" })
    PeopleFile findPeopleFileList();


    @POST
    @Path("/savePeopleFile")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    int savePeopleFile(List<PeopleFile> peopleFileList);

    /*@DELETE
    @Path("/peopleFile/")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    int deletePeopleFile(List<Integer> ids);*/

    @PUT
    @Path("/updatePeople")
    @Consumes({ "application/xml", "application/json" })
    int updatePeople(List<PeopleFile> peopleFileList);

    @GET
    @Path("/findQjwList")
    @Produces({ "application/xml", "application/json" })
    public List<Qjw> findQjwList();

    @POST
    @Path("/saveQjw")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    int saveQjw(List<Qjw> qjws);

    @PUT
    @Path("/updateQjw")
    @Consumes({ "application/xml", "application/json" })
    int updateQjw(List<Qjw> qjws);

    @DELETE
    @Path("/deleteQjw")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    int deletePeopleFile(List<Integer> ids);


    @GET
    @Path("/findQwbList")
    @Produces({ "application/xml", "application/json" })
    public List<Qwb> findQwbList();

    @POST
    @Path("/saveQwb")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    public List<Qwb> saveQwb(List<Qwb> qwbs);

    @PUT
    @Path("/updateQwb")
    @Consumes({ "application/xml", "application/json" })
    int updateQwb(List<Qwb> qwbs);

    @DELETE
    @Path("/deleteQwb")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    int deleteQwb(List<Integer> ids);

    @GET
    @Path("/findRlbList")
    @Produces({ "application/xml", "application/json" })
    public List<Rlb> findRlbList();

    @POST
    @Path("/saveRlb")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    public List<Rlb> saveRlb(List<Rlb> rlbs);

    @PUT
    @Path("/updateRlb")
    @Consumes({ "application/xml", "application/json" })
    int updateRlb(List<Rlb> rlbs);

    @DELETE
    @Path("/deleteRlb")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    int deleteRlb(List<Integer> ids);


    @GET
    @Path("/findZfbList")
    @Produces({ "application/xml", "application/json" })
    public List<Zfb> findZfbList();

    @POST
    @Path("/saveZfb")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    public List<Zfb> saveZfb(List<Zfb> zfbs);

    @PUT
    @Path("/updateZfb")
    @Consumes({ "application/xml", "application/json" })
    int updateZfb(List<Zfb> zfbs);

    @DELETE
    @Path("/deleteZfb")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    int deleteZfb(List<Integer> ids);

    @GET
    @Path("/findZxList")
    @Produces({ "application/xml", "application/json" })
    public List<Zx> findZxList();

    @POST
    @Path("/saveZx")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    public List<Zx> saveZx(List<Zx> zxs);

    @PUT
    @Path("/updateZx")
    @Consumes({ "application/xml", "application/json" })
    int updateZx(List<Zx> zxs);

    @DELETE
    @Path("/deleteZx")
    @Consumes({ "application/xml", "application/json" })
    @Produces({ "application/xml", "application/json" })
    int deleteZx(List<Integer> ids);
}
