import { Component, OnInit } from '@angular/core';
import { User } from '../model/user';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { EmpService } from '../services/emp.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:any={
    "username":"",
    "password":""
  };
  constructor(private route:Router,private empSer:EmpService) { }

  ngOnInit(): void {
  }

  validatePassword(){
    if(this.user.username =='admin' && this.user.password=='password'){
      
      this.route.navigate(['first'],{queryParams:this.user});
    }
  }

}
