package com.example.labcorp.controller;

import com.example.labcorp.model.Employee;
import com.example.labcorp.model.HourlyEmployee;
import com.example.labcorp.model.SalariedEmployee;
import com.example.labcorp.model.Manager;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Employee>> getEmployees() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "http://localhost:64661");
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Content-Type, Authorization");
        return new ResponseEntity<>(employees, headers, HttpStatus.OK);
    }

    @PutMapping("/{id}/work/{days}")
    public void work(@PathVariable int id, @PathVariable int days) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "http://localhost:64661");
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Content-Type, Authorization");
        employees.get(id).work(days);
    }

    @PutMapping("/{id}/vacation/{days}")
    public void takeVacation(@PathVariable int id, @PathVariable float days) {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Access-Control-Allow-Origin", "http://localhost:64661");
        headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        headers.add("Access-Control-Allow-Headers", "Content-Type, Authorization");
        employees.get(id).takeVacation(days);
    }
}

