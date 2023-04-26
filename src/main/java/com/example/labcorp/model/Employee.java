package com.example.labcorp.entity;

public abstract class Employee {
    private float vacationDays;
    private final float maxVacationDays;

    public Employee(float maxVacationDays) {
        this.vacationDays = 0;
        this.maxVacationDays = maxVacationDays;
    }

    public float getVacationDays() {
        return vacationDays;
    }

    public void work(int days) {
        if (days < 0 || days > 260) {
            throw new IllegalArgumentException("Invalid number of work days.");
        }
        vacationDays += getVacationDaysPerWorkYear() * (days / 260.0f);
        if (vacationDays > maxVacationDays) {
            vacationDays = maxVacationDays;
        }
    }

    public void takeVacation(float days) {
        if (days < 0 || days > vacationDays) {
            throw new IllegalArgumentException("Invalid number of vacation days.");
        }
        vacationDays -= days;
    }

    protected abstract float getVacationDaysPerWorkYear();
}

