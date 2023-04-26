package com.example.labcorp.entity;

import com.example.labcorp.entity.Employee;

public class SalariedEmployee extends Employee {
    public SalariedEmployee() {
        super(15);
    }

    @Override
    protected float getVacationDaysPerWorkYear() {
        return 15;
    }
}


