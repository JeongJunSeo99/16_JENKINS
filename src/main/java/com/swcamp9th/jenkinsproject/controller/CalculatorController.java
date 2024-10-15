package com.swcamp9th.jenkinsproject.controller;


import com.swcamp9th.jenkinsproject.dto.CalculatorDTO;
import com.swcamp9th.jenkinsproject.service.CalculatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "I'm alive";
    }

    @GetMapping("/plus")
    public ResponseEntity<CalculatorDTO> plusTwoNumbers(CalculatorDTO calculatorDTO) {
        log.info("갑 확인 : {}", calculatorDTO);

        int result = calculatorService.plusToNumbers(calculatorDTO);

        calculatorDTO.setSum(result);

        return ResponseEntity
            .ok()
            .body(calculatorDTO);
    }

}
