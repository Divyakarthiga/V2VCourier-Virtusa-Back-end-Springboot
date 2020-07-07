import { Component, OnInit } from '@angular/core';
import { OrdPayload } from '../add-ord/ord-payload';
import { ActivatedRoute, Router } from '@angular/router';
import { AddOrdService } from '../add-ord.service';
import { FormGroup, FormBuilder } from '@angular/forms';
import { DeliveryPayLoad } from './delivery-payload';
import { AddDeliveryService } from '../add-delivery.service';

@Component({
  selector: 'app-add-delivery',
  templateUrl: './add-delivery.component.html',
  styleUrls: ['./add-delivery.component.css']
})
export class AddDeliveryComponent implements OnInit {

  ord:OrdPayload;
  peramLink:Number;
  registerForm:FormGroup;
  deliveryPayload:DeliveryPayLoad;


  constructor(private router:ActivatedRoute,private ordService:AddOrdService,private formBuilder:FormBuilder,private adddeliveryService:AddDeliveryService,private router1:Router) { 
    this.registerForm = this.formBuilder.group({
      bbname: '',
      bl: '',
      shin: '',
      db: '',
      dofD: ''
  });
  this.deliveryPayload={
    bbname: '',
      bl: '',
      shin: '',
      db: '',
      dofD: ''
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
    this.deliveryPayload.bbname = this.registerForm.get('bbname').value;
    this.deliveryPayload.bl = this.registerForm.get('bl').value;
    this.deliveryPayload.shin = this.registerForm.get('shin').value;
    this.deliveryPayload.db = this.registerForm.get('db').value;
    this.deliveryPayload.dofD = this.registerForm.get('dofD').value;
    

    this.adddeliveryService.delivery(this.deliveryPayload).subscribe(data =>{
      console.log("Add delivery success");
      this.router1.navigateByUrl('/view-delivery');

    },error =>{
      console.log("add delivery failed failed");
    });
    
  }


}
