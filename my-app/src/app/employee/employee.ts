export class Employee {
  id: number;
  type: string;
  name: string;
  vacationDays: number;
  daysWorked: number;

  constructor(id: number, type: string, name: string, vacationDays: number) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.vacationDays = vacationDays;
    this.daysWorked = 0;
  }
}
