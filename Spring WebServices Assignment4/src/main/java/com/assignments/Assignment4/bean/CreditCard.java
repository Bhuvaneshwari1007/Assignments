package com.assignments.Assignment4.bean;

public class CreditCard {
	private String cardName;
    private String cardNo;

   public CreditCard() {
    }

   public CreditCard(String cardName, String cardNo) {
        super();
        this.cardName = cardName;
        this.cardNo = cardNo;
    }

   public String getCardName() {
        return cardName;
    }

   public void setCardName(String cardName) {
        this.cardName = cardName;
    }

   public String getCardNo() {
        return cardNo;
    }

   public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

   @Override
    public String toString() {
        return "CreditCard [cardName=" + cardName + ", cardNo=" + cardNo + "]";
    }

}
