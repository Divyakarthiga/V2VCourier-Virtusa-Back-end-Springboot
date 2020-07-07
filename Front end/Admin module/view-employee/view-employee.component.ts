import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { EmployeePayload } from '../add-employee/employee-payload';
import { AddEmployeeService } from '../add-employee.service';

@Component({
  selector: 'app-view-employee',
  templateUrl: './view-employee.component.html',
  styleUrls: ['./view-employee.component.css']
})
export class ViewEmployeeComponent implements OnInit {

  employees:Observable<Array<EmployeePayload>>

  constructor(private addemployeeService:AddEmployeeService) { }

  ngOnInit(): void {
    this.employees = this.addemployeeService.getAllEmployee();
  }

}
