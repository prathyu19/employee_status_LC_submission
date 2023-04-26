package com.example.labcorp.model;

public class SalariedEmployee extends Employee {
    public SalariedEmployee() {
        super(15);
    }

    @Override
    protected float getVacationDaysPerWorkYear() {
        return 15;
    }
}


