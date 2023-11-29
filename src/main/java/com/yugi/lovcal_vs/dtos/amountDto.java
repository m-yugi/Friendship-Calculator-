package com.yugi.lovcal_vs.dtos;

public class amountDto {
    private String amount;
    private String symbol;

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String sybmol) {
        this.symbol = sybmol;
    }

    @Override
    public String toString() {
        return amount + " " + symbol;
    }
}
