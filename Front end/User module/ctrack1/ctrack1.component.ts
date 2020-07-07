import { Component, OnInit } from '@angular/core';
import { DispatchPayLoad } from '../add-dispatch/dispatch-payload';
import { ActivatedRoute } from '@angular/router';
import { AddDispatchService } from '../add-dispatch.service';

@Component({
  selector: 'app-ctrack1',
  templateUrl: './ctrack1.component.html',
  styleUrls: ['./ctrack1.component.css']
})
export class Ctrack1Component implements OnInit {

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

