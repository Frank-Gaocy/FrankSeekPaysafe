package com.frank.demo.webservice.msgtype;

import com.frank.demo.webservice.msgtype.commtypes.*;

import java.util.ArrayList;

public class TypeEnrollmentLookupsRsp {
    private String acsURL;
    private TypeCard card;
    private String eci;
    private TypeError error;
    private String id;
    private ArrayList<TypeLink> links;
    private String paReq;
    private TypeStatus status;
    private TypeThreeDEnrollment threeDEnrollment;
    private String txnTime;

    public String getAcsURL() {
        return acsURL;
    }

    public void setAcsURL(String acsURL) {
        this.acsURL = acsURL;
    }

    public TypeCard getCard() {
        return card;
    }

    public void setCard(TypeCard card) {
        this.card = card;
    }

    public String getEci() {
        return eci;
    }

    public void setEci(String eci) {
        this.eci = eci;
    }

    public TypeError getError() {
        return error;
    }

    public void setError(TypeError error) {
        this.error = error;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<TypeLink> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<TypeLink> links) {
        this.links = links;
    }

    public String getPaReq() {
        return paReq;
    }

    public void setPaReq(String paReq) {
        this.paReq = paReq;
    }

    public TypeStatus getStatus() {
        return status;
    }

    public void setStatus(TypeStatus status) {
        this.status = status;
    }

    public TypeThreeDEnrollment getThreeDEnrollment() {
        return threeDEnrollment;
    }

    public void setThreeDEnrollment(TypeThreeDEnrollment threeDEnrollment) {
        this.threeDEnrollment = threeDEnrollment;
    }

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }
}
