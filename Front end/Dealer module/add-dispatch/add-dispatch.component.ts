import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { AddOrdService } from '../add-ord.service';
import { OrdPayload } from '../add-ord/ord-payload';
import { FormGroup, FormBuilder } from '@angular/forms';
import { DispatchPayLoad } from './dispatch-payload';
import { AddDispatchService } from '../add-dispatch.service';

@Component({
  selector: 'app-add-dispatch',
  templateUrl: './add-dispatch.component.html',
  styleUrls: ['./add-dispatch.component.css']
})
export class AddDispatchComponent implements OnInit {
  ord:OrdPayload;
  peramLink:Number;
  registerForm:FormGroup;
  dispatchPayload:DispatchPayLoad;

  constructor(private router:ActivatedRoute,private ordService:AddOrdService,private formBuilder:FormBuilder,private adddispatchService:AddDispatchService,private router1:Router) {
    this.registerForm = this.formBuilder.group({
      shipn: '',
      recen: '',
      receA: '',
      ph: '',
      desti: '',
      assigned: '',
      daDi: ''
  });
  this.dispatchPayload={
    shipn: '',
    recen: '',
    receA: '',
    ph: '',
    desti: '',
    assigned: '',
    daDi: ''
  };
   }

  ngOnInit(): void {
    this.router.params.subscribe(params=>{
      this.peramLink=params['oid'];
    });

    this.ordService.getOrd(this.peramLink).subscribe((data:OrdPayload)=>
    {
      this.ord=data;
    },(err:any)=>
    {
console.log('Failure response');
    })
  }
  onSubmit()
  {
    this.dispatchPayload.shipn = this.registerForm.get('shipn').value;
    this.dispatchPayload.recen = this.registerForm.get('recen').value;
    this.dispatchPayload.receA = this.registerForm.get('receA').value;
    this.dispatchPayload.ph = this.registerForm.get('ph').value;
    this.dispatchPayload.desti = this.registerForm.get('desti').value;
    this.dispatchPayload.assigned = this.registerForm.get('assigned').value;
    this.dispatchPayload.daDi = this.registerForm.get('daDi').value;
    

    this.adddispatchService.dispatch(this.dispatchPayload).subscribe(data =>{
      console.log("Add dispatch success");
      this.router1.navigateByUrl('/view-dispatch');

    },error =>{
      console.log("add dispatch  failed");
    });
    
  }


}
