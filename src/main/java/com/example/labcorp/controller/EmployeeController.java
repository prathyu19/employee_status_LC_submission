package com.example.labcorp.controller;

import com.example.labcorp.model.Employee;
import com.example.labcorp.model.HourlyEmployee;
import com.example.labcorp.model.SalariedEmployee;
import com.example.labcorp.model.Manager;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final List<Employee> employees;

    public EmployeeController() {
        employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            employees.add(new HourlyEmployee());
            employees.add(new SalariedEmployee());
            employees.add(new Manager());
        }
    }

    @GetMapping("")
    public List<Employee> getEmployees() {
        return employees;
    }

    @PutMapping("/{id}/work/{days}")
    public void work(@PathVariable int id, @PathVariable int days) {
        employees.get(id).work(days);
    }

    @PutMapping("/{id}/vacation/{days}")
    public void takeVacation(@PathVariable int id, @PathVariable float days) {
        employees.get(id).takeVacation(days);
    }
}

