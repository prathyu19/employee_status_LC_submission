package com.example.labcorp.entity;

import com.example.labcorp.entity.SalariedEmployee;

public class Manager extends SalariedEmployee {
    public Manager() {
        super();
    }

    @Override
    protected float getVacationDaysPerWorkYear() {
        return 30;
    }
}


