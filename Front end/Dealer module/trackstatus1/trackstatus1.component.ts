import { Component, OnInit } from '@angular/core';
import { DispatchPayLoad } from '../add-dispatch/dispatch-payload';
import { ActivatedRoute } from '@angular/router';
import { AddDispatchService } from '../add-dispatch.service';

@Component({
  selector: 'app-trackstatus1',
  templateUrl: './trackstatus1.component.html',
  styleUrls: ['./trackstatus1.component.css']
})
export class Trackstatus1Component implements OnInit {

  dispatch:DispatchPayLoad;
  peramLink:Number;

  constructor(private router:ActivatedRoute,private dispatchService:AddDispatchService) { }

  ngOnInit(): void {
    this.router.params.subscribe(params=>{
      this.peramLink=params['diId'];
    });

    this.dispatchService.getDispatch(this.peramLink).subscribe((data:DispatchPayLoad)=>
    {
      this.dispatch=data;
    },(err:any)=>
    {
console.log('Failure response');
    })
  }

}

