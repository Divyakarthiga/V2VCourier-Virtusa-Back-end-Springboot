import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dealer-login',
  templateUrl: './dealer-login.component.html',
  styleUrls: ['./dealer-login.component.css']
})
export class DealerLoginComponent implements OnInit {

  user:String;
  password:String;

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  LoginUser()
  {
    if(this.user == "Dealer" && this.password =="dealer123")
    {
      console.log("Welcome divya");
      this.router.navigateByUrl('/dealer-module');
    }
  }

}
