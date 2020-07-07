import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { DeliveryPayLoad } from './add-delivery/delivery-payload';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddDeliveryService {
  private url= "http://localhost:8080/api/delivery/"

  constructor(private httpClient:HttpClient) { }

  delivery(deliveryPayload:DeliveryPayLoad):Observable<any>
  {
    return this.httpClient.post(this.url + "AddDelivery",deliveryPayload);
  }
  getAllDelivery():Observable<Array<DeliveryPayLoad>>
  {
   return this.httpClient.get<Array<DeliveryPayLoad>>("http://localhost:8080/api/delivery/showdelivery");
  }

  getDelivery(peramLink:Number):Observable<DeliveryPayLoad>
  {
    return this.httpClient.get<DeliveryPayLoad>('http://localhost:8080/api/delivery/getDelivery/'+peramLink);
  }
}
