package com.example.labcorp;

import com.example.labcorp.model.Employee;
import com.example.labcorp.model.HourlyEmployee;
import com.example.labcorp.model.Manager;
import com.example.labcorp.model.SalariedEmployee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    private List<Employee> employees;

    public EmployeeDatabase() {
        employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employees.add(new HourlyEmployee());
            employees.add(new SalariedEmployee());
            employees.add(new Manager());
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

