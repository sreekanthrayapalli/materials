import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:any = {

  }
  constructor(private route:Router) { }

  ngOnInit(): void {
  }

  validateUser(){
    if(this.user.username=="admin" && this.user.password=="admin"){
      this.route.navigate(['first'],{queryParams:this.user});
    }else{
      alert("Invalid details");
    }
  }
}
