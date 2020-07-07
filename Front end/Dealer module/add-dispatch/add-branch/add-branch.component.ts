import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { BranchPayload } from './branch-payload';
import { AddBranchService } from '../add-branch.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-branch',
  templateUrl: './add-branch.component.html',
  styleUrls: ['./add-branch.component.css']
})
export class AddBranchComponent implements OnInit {

  registerForm:FormGroup;
  branchPayload:BranchPayload;


  constructor(private formBuilder:FormBuilder,private addbranchService:AddBranchService,private router:Router) { 
    this.registerForm = this.formBuilder.group({
      bname: '',
      mainBrAdd: '',
  });
  this.branchPayload={
    bname: '',
    mainBrAdd: ''
  };
}

  ngOnInit(): void {
  }

  onSubmit()
  {
    this.branchPayload.bname = this.registerForm.get('bname').value;
    this.branchPayload.mainBrAdd = this.registerForm.get('mainBrAdd').value;

    this.addbranchService.branch(this.branchPayload).subscribe(data =>{
      console.log("branch success");
      this.router.navigateByUrl('/branch-success');

    },error =>{
      console.log("branch failed");
    });
    
  }

}
