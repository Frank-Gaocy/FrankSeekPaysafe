package com.frank.demo.webservice.msgtype;

import com.frank.demo.webservice.msgtype.commtypes.TypeCard;

public class TypeEnrollmentLookupsReq {
    private String acceptHeader;
    private int amount;
    private TypeCard card;
    private String currency;
    private String customerIp;
    private String merchantRefNum;
    private String merchantUrl;
    private String userAgent;

    public String getAcceptHeader() {
        return acceptHeader;
    }

    public void setAcceptHeader(String acceptHeader) {
        this.acceptHeader = acceptHeader;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public TypeCard getCard() {
        return card;
    }

    public void setCard(TypeCard card) {
        this.card = card;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCustomerIp() {
        return customerIp;
    }

    public void setCustomerIp(String customerIp) {
        this.customerIp = customerIp;
    }

    public String getMerchantRefNum() {
        return merchantRefNum;
    }

    public void setMerchantRefNum(String merchantRefNum) {
        this.merchantRefNum = merchantRefNum;
    }

    public String getMerchantUrl() {
        return merchantUrl;
    }

    public void setMerchantUrl(String merchantUrl) {
        this.merchantUrl = merchantUrl;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
}
