import { Component, OnInit } from '@angular/core';
import { OrdPayload } from '../add-ord/ord-payload';
import { ActivatedRoute } from '@angular/router';
import { AddOrdService } from '../add-ord.service';
import { DeliveryPayLoad } from '../add-delivery/delivery-payload';
import { AddDeliveryService } from '../add-delivery.service';

@Component({
  selector: 'app-trackstatus',
  templateUrl: './trackstatus.component.html',
  styleUrls: ['./trackstatus.component.css']
})
export class TrackstatusComponent implements OnInit {
  delivery:DeliveryPayLoad;
  peramLink:Number;

  constructor(private router:ActivatedRoute,private deliveryService:AddDeliveryService) { }

  ngOnInit(): void {
    this.router.params.subscribe(params=>{
      this.peramLink=params['did'];
    });

    this.deliveryService.getDelivery(this.peramLink).subscribe((data:DeliveryPayLoad)=>
    {
      this.delivery=data;
    },(err:any)=>
    {
console.log('Failure response');
    })
  }

}
