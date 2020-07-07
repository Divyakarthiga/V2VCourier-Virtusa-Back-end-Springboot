import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {OrdPayload} from './add-ord/ord-payload';

@Injectable({
  providedIn: 'root'
})
export class AddOrdService {

  private url= "http://localhost:8080/api/ord/"

  constructor(private httpClient:HttpClient) { }

  order(ordPayload:OrdPayload):Observable<any>
  {
    return this.httpClient.post(this.url + "AddOrd",ordPayload);
  }

  getAllOrd():Observable<Array<OrdPayload>>
  {
   return this.httpClient.get<Array<OrdPayload>>("http://localhost:8080/api/ord/show");
  }

  getOrd(peramLink:Number):Observable<OrdPayload>
  {
    return this.httpClient.get<OrdPayload>('http://localhost:8080/api/ord/getDelivery/'+peramLink);
  }
}
