package com.example.labcorp.entity;

public class HourlyEmployee extends Employee {
    public HourlyEmployee() {
        super(10);
    }

    @Override
    protected float getVacationDaysPerWorkYear() {
        return 10;
    }
}


