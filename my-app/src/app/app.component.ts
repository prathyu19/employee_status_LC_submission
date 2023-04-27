import {Component, OnInit} from '@angular/core';
import {Employee} from "./employee/employee";
import {EmployeeService} from "./employee/employee.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'my-app';

  employees: Employee[] = [];
  daysTaken: any;
  daysWorked: any;

  constructor(private employeeService: EmployeeService) { }

  ngOnInit(): void {
    this.getEmployees();
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
