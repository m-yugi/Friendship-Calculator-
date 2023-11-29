package com.yugi.lovcal_vs.converters;

import org.springframework.core.convert.converter.Converter;

import com.yugi.lovcal_vs.dtos.cardDto;

public class creditCardConverter implements Converter<String, cardDto> {

    @Override
    public cardDto convert(String card) {
        cardDto resultcard = new cardDto();
        String[] arr = card.split("-");
        resultcard.setFirst(arr[0]);
        resultcard.setSecond(arr[1]);
        resultcard.setThird(arr[2]);
        resultcard.setFourth(arr[3]);
        return resultcard;
    }

}