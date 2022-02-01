package com.piateam.areacalculation.controller;

import com.piateam.areacalculation.service.AreaCalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaCalcController {

    @Autowired
    AreaCalcService areaCalcService;

    @PostMapping(value = "/square-area-calculation")
    public float squareAreaCalculation(@RequestParam float length) {
            return areaCalcService.squareAreaCalculation(length);
    }

}
