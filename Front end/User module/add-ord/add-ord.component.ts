import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { AddOrdService } from '../add-ord.service';
import { Router } from '@angular/router';
import { OrdPayload } from './ord-payload';

@Component({
  selector: 'app-add-ord',
  templateUrl: './add-ord.component.html',
  styleUrls: ['./add-ord.component.css']
})
export class AddOrdComponent implements OnInit {

  registerForm:FormGroup;
  ordPayload:OrdPayload;

  constructor( private formBuilder:FormBuilder,private addordService:AddOrdService,private router:Router) {
   this.registerForm = this.formBuilder.group({
      sname: '',
      src: '',
      des: '',
      mat: '',
      rname: '',
      saddr: '',
      raddr: '',
      totalW: '',
      category: '',
      dod: '',
      rph: '',
      sph: ''
    });
    this.ordPayload={
      sname: '',
      src: '',
      des: '',
      mat: '',
      rname: '',
      saddr: '',
      raddr: '',
      totalW: '',
      category: '',
      dod: '',
      rph: '',
      sph: ''
    };
   }

  ngOnInit(): void {
  }

  onSubmit()
  {
    this.ordPayload.sname = this.registerForm.get('sname').value;
    this.ordPayload.src = this.registerForm.get('src').value;
    this.ordPayload.des = this.registerForm.get('des').value;
    this.ordPayload.mat = this.registerForm.get('mat').value;
    this.ordPayload.rname = this.registerForm.get('rname').value;
    this.ordPayload.saddr = this.registerForm.get('saddr').value;
    this.ordPayload.raddr = this.registerForm.get('raddr').value;
    this.ordPayload.totalW = this.registerForm.get('totalW').value;
    this.ordPayload.category = this.registerForm.get('category').value;
    this.ordPayload.dod = this.registerForm.get('dod').value;
    this.ordPayload.rph = this.registerForm.get('rph').value;
    this.ordPayload.sph = this.registerForm.get('sph').value;

    this.addordService.order(this.ordPayload).subscribe(data =>{
      console.log("order success");
      this.router.navigateByUrl('/ord-success');

    },error =>{
      console.log("order failed");
    });
    
  }

}
