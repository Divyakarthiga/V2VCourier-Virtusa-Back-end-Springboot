import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  user:String;
  password:String;

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  LoginUser()
  {
    if(this.user == "Admin" && this.password =="admin123")
    {
      console.log("Welcome divya");
      this.router.navigateByUrl('/admin-module');
    }
  }

}
