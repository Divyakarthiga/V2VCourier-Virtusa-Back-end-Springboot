import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { EmployeePayload } from './employee-payload';
import { AddEmployeeService } from '../add-employee.service';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  registerForm:FormGroup;
  employeePayload:EmployeePayload;


  constructor(private formBuilder:FormBuilder,private addemployeeService:AddEmployeeService,private router:Router) { 
    this.registerForm = this.formBuilder.group({
      employeeName: '',
      empEmail: '',
      ro: '',
      sal: '',
      branchNam: '',
      branchLo: ''
  });
  this.employeePayload={
    employeeName: '',
      empEmail: '',
      ro: '',
      sal: '',
      branchNam: '',
      branchLo: ''
   
  };
}

  ngOnInit(): void {
  }
  onSubmit()
  {
    this.employeePayload.employeeName = this.registerForm.get('employeeName').value;
    this.employeePayload.empEmail = this.registerForm.get('empEmail').value;
    this.employeePayload.ro = this.registerForm.get('ro').value;
    this.employeePayload.sal = this.registerForm.get('sal').value;
    this.employeePayload.branchNam = this.registerForm.get('branchNam').value;
    this.employeePayload.branchLo = this.registerForm.get('branchLo').value;
    

    this.addemployeeService.employee(this.employeePayload).subscribe(data =>{
      console.log("add employee success");

    },error =>{
      console.log("add employee failed");
    });
    
  }


}
