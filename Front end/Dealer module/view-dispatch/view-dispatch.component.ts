import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { DispatchPayLoad } from '../add-dispatch/dispatch-payload';
import { AddDispatchService } from '../add-dispatch.service';

@Component({
  selector: 'app-view-dispatch',
  templateUrl: './view-dispatch.component.html',
  styleUrls: ['./view-dispatch.component.css']
})
export class ViewDispatchComponent implements OnInit {

  dispatches:Observable<Array<DispatchPayLoad>>

  constructor(private adddispatchService:AddDispatchService) { }

  ngOnInit(): void {
    this.dispatches = this.adddispatchService.getAllDispatch();
  }


}
