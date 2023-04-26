package com.example.labcorp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
    private EmployeeDatabase database = new EmployeeDatabase();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("employees", database.getEmployees());
        return "index";
    }

    @PostMapping("/work/{index}")
    public String work(@PathVariable int index, @RequestParam("daysWorked") int daysWorked) {
        Employee employee = database.getEmployees().get(index);
        employee.work(daysWorked);
        return "redirect:/";
    }

    @PostMapping("/vacation/{index}")
    public String vacation(@PathVariable int index, @RequestParam("daysOff") float daysOff) {
        Employee employee = database.getEmployees().get(index);
        employee.takeVacation(daysOff);
        return "redirect:/";
    }
}

