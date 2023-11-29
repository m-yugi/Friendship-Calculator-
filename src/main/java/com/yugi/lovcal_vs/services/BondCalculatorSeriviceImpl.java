package com.yugi.lovcal_vs.services;

import org.springframework.stereotype.Service;

@Service
public class BondCalculatorSeriviceImpl implements BondCalculatorSerivice {

    @Override
    public String bondCalculator(int value) {
        if (value > 0 && value < 50) {
            return "weak";
        } else if (value > 50 && value < 70) {
            return "medium";
        }
        return "strong";
    }

}