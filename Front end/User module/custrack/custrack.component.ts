import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { DispatchPayLoad } from '../add-dispatch/dispatch-payload';
import { AddDispatchService } from '../add-dispatch.service';

@Component({
  selector: 'app-custrack',
  templateUrl: './custrack.component.html',
  styleUrls: ['./custrack.component.css']
})
export class CustrackComponent implements OnInit {

  dispatches:Observable<Array<DispatchPayLoad>>

  constructor(private adddispatchService:AddDispatchService) { }

  ngOnInit(): void {
    this.dispatches = this.adddispatchService.getAllDispatch();
  }


}
