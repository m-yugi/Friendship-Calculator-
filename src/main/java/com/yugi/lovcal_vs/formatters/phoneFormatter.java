package com.yugi.lovcal_vs.formatters;

import java.text.ParseException;
import java.util.Locale;
import org.springframework.format.Formatter;
import com.yugi.lovcal_vs.dtos.phoneDto;

public class phoneFormatter implements Formatter<phoneDto> {

    @Override
    public String print(phoneDto phone, Locale locale) {
        return phone.getCountry() + "-" + phone.getPhoneNumber();
    }

    @Override
    public phoneDto parse(String phone, Locale locale) throws ParseException {
        phoneDto phoneDto = new phoneDto();
        String[] result = new String[2];
        result[0] = "91";
        int index = phone.indexOf("-");
        if (index == -1) {
            result[1] = phone;
        } else if (index == 0) {
            result[1] = phone.substring(1);
        } else {
            result = phone.split("-");
        }
        phoneDto.setCountry(result[0]);
        phoneDto.setPhoneNumber(result[1]);
        return phoneDto;
    }

}