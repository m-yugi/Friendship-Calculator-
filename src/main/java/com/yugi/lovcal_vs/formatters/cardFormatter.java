package com.yugi.lovcal_vs.formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;
import com.yugi.lovcal_vs.dtos.cardDto;

public class cardFormatter implements Formatter<cardDto> {

    @Override
    public String print(cardDto card, Locale locale) {
        return card.getFirst() + "-" + card.getSecond() + "-" + card.getThird() + "-" + card.getFourth();
    }

    @Override
    public cardDto parse(String card, Locale locale) throws ParseException {
        cardDto resultcard = new cardDto();
        String[] arr = card.split("-");
        resultcard.setFirst(arr[0]);
        resultcard.setSecond(arr[1]);
        resultcard.setThird(arr[2]);
        resultcard.setFourth(arr[3]);
        return resultcard;
    }

}