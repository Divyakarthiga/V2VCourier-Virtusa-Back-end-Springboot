import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { DeliveryPayLoad } from '../add-delivery/delivery-payload';
import { AddDeliveryService } from '../add-delivery.service';

@Component({
  selector: 'app-view-delivery',
  templateUrl: './view-delivery.component.html',
  styleUrls: ['./view-delivery.component.css']
})
export class ViewDeliveryComponent implements OnInit {
  deliveries:Observable<Array<DeliveryPayLoad>>

  constructor(private adddeliveryService:AddDeliveryService) { }

  ngOnInit(): void {
    this.deliveries = this.adddeliveryService.getAllDelivery();
  }

}
