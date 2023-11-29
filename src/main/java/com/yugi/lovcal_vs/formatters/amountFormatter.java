package com.yugi.lovcal_vs.formatters;

import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.yugi.lovcal_vs.dtos.amountDto;

public class amountFormatter implements Formatter<amountDto> {

    @Override
    public String print(amountDto amount, Locale locale) {
        return amount.getAmount() + " " + amount.getSymbol();
    }

    @Override
    public amountDto parse(String amount, Locale locale) throws ParseException {
        amountDto resultamount = new amountDto();
        String[] arr = amount.split(" ");
        Currency currency = Currency.getInstance(arr[1]);
        String symbol = currency.getSymbol(locale);
        resultamount.setAmount(arr[0]);
        resultamount.setSymbol(symbol);
        return resultamount;
    }

}