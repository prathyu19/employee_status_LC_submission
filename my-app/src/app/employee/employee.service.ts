import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
// @ts-ignore
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private baseUrl = '/api/employees';

  constructor(private http: HttpClient) { }

  getEmployees(): Observable<Employee[]> {
    return this.http.get<Employee[]>(this.baseUrl);
  }

  work(id: number, days: number): Observable<void> {
    return this.http.put<void>(`${this.baseUrl}/${id}/work/${days}`, null);
  }

  takeVacation(id: number, days: number): Observable<void> {
    return this.http.put<void>(`${this.baseUrl}/${id}/vacation/${days}`, null);
  }
}
