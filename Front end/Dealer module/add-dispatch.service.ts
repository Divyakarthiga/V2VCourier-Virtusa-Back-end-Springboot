import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { DispatchPayLoad } from './add-dispatch/dispatch-payload';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddDispatchService {

  private url= "http://localhost:8080/api/dispatch/"

  constructor(private httpClient:HttpClient) { }

  dispatch(dispatchPayload:DispatchPayLoad):Observable<any>
  {
    return this.httpClient.post(this.url + "AddDispatch",dispatchPayload);
  }
  getAllDispatch():Observable<Array<DispatchPayLoad>>
  {
   return this.httpClient.get<Array<DispatchPayLoad>>("http://localhost:8080/api/dispatch/showdispatch");
  }
  getDispatch(peramLink:Number):Observable<DispatchPayLoad>
  {
    return this.httpClient.get<DispatchPayLoad>('http://localhost:8080/api/dispatch/getDispatch/'+peramLink);
  }
}
