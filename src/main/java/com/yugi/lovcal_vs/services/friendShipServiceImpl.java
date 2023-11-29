package com.yugi.lovcal_vs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class friendShipServiceImpl implements friendShipService {
    @Autowired
    private BondCalculatorSeriviceImpl bondcalculator;

    public int calculatorLogic(String friend1, String friend2) {
        int friend1Add = stringSumcal(friend1);
        int friend2Add = stringSumcal(friend2);
        double mini = (double) Math.min(friend1Add, friend2Add);
        double maxi = (double) Math.max(friend2Add, friend1Add);
        int friendShip = (int) ((mini / maxi) * 100);
        return friendShip;
    }

    public int stringSumcal(String name) {
        int sum = 0;
        for (char letter : name.toCharArray()) {
            sum += (int) (letter - 'a');
        }
        return sum + name.length();
    }

    public String getBond(int value) {
        return bondcalculator.bondCalculator(value);
    }

}