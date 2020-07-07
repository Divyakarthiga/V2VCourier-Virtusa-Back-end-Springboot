import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { EmployeePayload } from './add-employee/employee-payload';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddEmployeeService {
  private url= "http://localhost:8080/api/employee/"

  constructor(private httpClient:HttpClient) { }

  employee(employeePayload:EmployeePayload):Observable<any>
  {
    return this.httpClient.post(this.url + "AddEmployee",employeePayload);
  }
  getAllEmployee():Observable<Array<EmployeePayload>>
  {
   return this.httpClient.get<Array<EmployeePayload>>("http://localhost:8080/api/employee/showEmployee");
  }
 
}
