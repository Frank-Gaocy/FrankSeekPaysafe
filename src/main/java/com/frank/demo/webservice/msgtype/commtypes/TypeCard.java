package com.frank.demo.webservice.msgtype.commtypes;

public class TypeCard {
    private String cardNum;
    private TypeCardExpiry cardExpiry;
    private String lastDigits;
    private TypeCardKind type;

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public TypeCardExpiry getCardExpiry() {
        return cardExpiry;
    }

    public void setCardExpiry(TypeCardExpiry cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    public String getLastDigits() {
        return lastDigits;
    }

    public void setLastDigits(String lastDigits) {
        this.lastDigits = lastDigits;
    }

    public TypeCardKind getType() {
        return type;
    }

    public void setType(TypeCardKind type) {
        this.type = type;
    }
}
