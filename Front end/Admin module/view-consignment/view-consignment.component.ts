import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { OrdPayload } from '../add-ord/ord-payload';
import { AddOrdService } from '../add-ord.service';

@Component({
  selector: 'app-view-consignment',
  templateUrl: './view-consignment.component.html',
  styleUrls: ['./view-consignment.component.css']
})
export class ViewConsignmentComponent implements OnInit {

  ords:Observable<Array<OrdPayload>>

  constructor(private addordService:AddOrdService) { }

  ngOnInit(): void {
    this.ords = this.addordService.getAllOrd();
  }

}
