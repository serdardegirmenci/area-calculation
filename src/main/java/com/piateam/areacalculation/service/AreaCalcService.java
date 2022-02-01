package com.piateam.areacalculation.service;

import org.springframework.stereotype.Service;

@Service
public class AreaCalcService {
    public float squareAreaCalculation(float length){
        return length * length;
    }
}
