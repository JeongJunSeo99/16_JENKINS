package com.swcamp9th.jenkinsproject.service;

import com.swcamp9th.jenkinsproject.dto.CalculatorDTO;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int plusToNumbers(CalculatorDTO calculatorDTO) {
        return calculatorDTO.getNum1() + calculatorDTO.getNum2();
    }
}
