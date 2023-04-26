package com.example.labcorp.model;

public class Manager extends SalariedEmployee {
    public Manager() {
        super();
    }

    @Override
    protected float getVacationDaysPerWorkYear() {
        return 30;
    }
}


