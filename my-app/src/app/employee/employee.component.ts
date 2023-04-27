import { Component, OnInit } from '@angular/core';
import { Employee } from './employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employees: Employee[] = [];
  // daysTaken: any;
  // daysWorked: any;

  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
    // this.getEmployees();
  }

  getEmployees(): void {
    this.employeeService.getEmployees()
      .subscribe((employees: Employee[]) => {
        return this.employees = employees;
      });
  }

  work(id: number, days: number): void {
    this.employeeService.work(id, days)
      .subscribe(() => this.getEmployees());
  }

  takeVacation(id: number, days: number): void {
    this.employeeService.takeVacation(id, days)
      .subscribe(() => this.getEmployees());
  }
}
