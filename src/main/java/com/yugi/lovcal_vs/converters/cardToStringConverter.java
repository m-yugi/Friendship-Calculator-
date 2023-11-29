package com.yugi.lovcal_vs.converters;

import org.springframework.core.convert.converter.Converter;

import com.yugi.lovcal_vs.dtos.cardDto;

public class cardToStringConverter implements Converter<cardDto, String> {

    @Override
    public String convert(cardDto source) {
        return source.toString();
    }

}