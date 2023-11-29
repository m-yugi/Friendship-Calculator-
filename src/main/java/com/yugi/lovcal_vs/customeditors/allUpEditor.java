package com.yugi.lovcal_vs.customeditors;

import java.beans.PropertyEditorSupport;

public class allUpEditor extends PropertyEditorSupport {

    // @Override
    // public String getAsText() {
    // String name = (String) getValue();
    // name.toLowerCase();
    // return name;
    // }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        setValue(text.toUpperCase());
    }

}