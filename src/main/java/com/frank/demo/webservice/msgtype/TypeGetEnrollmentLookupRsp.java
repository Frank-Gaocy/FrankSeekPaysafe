package com.frank.demo.webservice.msgtype;

import com.frank.demo.webservice.msgtype.commtypes.TypeCard;
import com.frank.demo.webservice.msgtype.commtypes.TypeLink;
import com.frank.demo.webservice.msgtype.commtypes.TypeStatus;
import com.frank.demo.webservice.msgtype.commtypes.TypeThreeDEnrollment;

import java.util.ArrayList;

public class TypeGetEnrollmentLookupRsp {
    private ArrayList<TypeLink> links;
    private String id;
    private String merchantRefNum;
    private String txnTime;
    private TypeStatus status;
    private int amount;
    private String currency;
    private TypeCard card;
    private String customerIp;
    private String acsURL;
    private String paReq;
    private int eci;
    private TypeThreeDEnrollment threeDEnrollment;

    public ArrayList<TypeLink> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<TypeLink> links) {
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerchantRefNum() {
        return merchantRefNum;
    }

    public void setMerchantRefNum(String merchantRefNum) {
        this.merchantRefNum = merchantRefNum;
    }

    public String getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(String txnTime) {
        this.txnTime = txnTime;
    }

    public TypeStatus getStatus() {
        return status;
    }

    public void setStatus(TypeStatus status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public TypeCard getCard() {
        return card;
    }

    public void setCard(TypeCard card) {
        this.card = card;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getAcsURL() {
        return acsURL;
    }

    public void setAcsURL(String acsURL) {
        this.acsURL = acsURL;
    }

    public String getPaReq() {
        return paReq;
    }

    public void setPaReq(String paReq) {
        this.paReq = paReq;
    }

    public int getEci() {
        return eci;
    }

    public void setEci(int eci) {
        this.eci = eci;
    }

    public TypeThreeDEnrollment getThreeDEnrollment() {
        return threeDEnrollment;
    }

    public void setThreeDEnrollment(TypeThreeDEnrollment threeDEnrollment) {
        this.threeDEnrollment = threeDEnrollment;
    }
}
