package com.frank.demo.webservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.frank.demo.webservice.msgtype.TypeEnrollmentLookupsReq;
import com.frank.demo.webservice.msgtype.TypeEnrollmentLookupsRsp;
import com.frank.demo.webservice.msgtype.TypeGetEnrollmentLookupRsp;
import com.frank.demo.webservice.msgtype.TypeMonitorResp;
import com.frank.demo.webservice.msgtype.commtypes.TypeCard;
import com.frank.demo.webservice.msgtype.commtypes.TypeCardExpiry;
import com.frank.demo.webservice.msgtype.commtypes.TypeCardKind;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.io.IOException;

@Path("/threedsecure")
public class ThreeDSecure {
    @GET
    @Path("/monitor")
    @Produces(MediaType.APPLICATION_JSON)
    public TypeMonitorResp monitor(){
        return new TypeMonitorResp();
    }

    @POST
    @Path("/v1/accounts/{account_id}/enrollmentchecks")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public TypeEnrollmentLookupsRsp enrollmentchecks(@PathParam("account_id") String account_id, TypeEnrollmentLookupsReq elReq){
        TypeEnrollmentLookupsRsp elRsp = new TypeEnrollmentLookupsRsp();
        elRsp.setAcsURL("https://vbv.issueracs.com/3ds/acsendpoint?foo=bar");
        elRsp.setTxnTime("2018-05-07T17:21:33Z");
        TypeCardExpiry tmp_ce = new TypeCardExpiry();
        tmp_ce.setMonth("02");
        tmp_ce.setYear("2019");
        TypeCard tmp_cd = new TypeCard();
        tmp_cd.setCardExpiry(tmp_ce);
        tmp_cd.setLastDigits("7890");
        tmp_cd.setType(TypeCardKind.VI);
        elRsp.setCard(tmp_cd);
        return elRsp;
    }

    @GET
    @Path("/v1/accounts/{account_id}/enrollmentchecks/{enrollment_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public TypeGetEnrollmentLookupRsp enrollmentchecks(@PathParam("account_id") String account_id,
                                                       @PathParam("enrollment_id") String enrl_id)
    {
        TypeGetEnrollmentLookupRsp elRsp = new TypeGetEnrollmentLookupRsp();
        elRsp.setAcsURL("https://pay.test.netbanx.com/emulator/test_acs");
        return elRsp;
    }
}
