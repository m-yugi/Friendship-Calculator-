package com.yugi.lovcal_vs.dtos;

public class billingDto {
    private cardDto cardnumber;
    private amountDto amount;

    public cardDto getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(cardDto cardnumber) {
        this.cardnumber = cardnumber;
    }

    public amountDto getAmount() {
        return amount;
    }

    public void setAmount(amountDto amount) {
        this.amount = amount;
    }

}