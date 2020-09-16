import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ngonchangeexample';
  a:number =0;

  user:any={
    name:"abc"
  }

  updateName(){
    this.user.name= "pqr";
  }

  callC(){
    this.user.name = "xyz";
    this.a++;
  }
  
}
