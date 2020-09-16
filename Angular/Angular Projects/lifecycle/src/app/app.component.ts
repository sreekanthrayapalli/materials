import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'lifecycle';
  a:number=0;

  private _num:number=0;

  user:any ={
    name:"abc",
    "lanme":""
  }

  increment(){
    this.a++;
  }

  isRemove(){
    return this.a>=4;
  }

  updateName(){
     this.user.name="xyz"+this.a; //changing existance value
  //  this.user = {          //re-create entire object
  //    name:"xyz"+this.a
  //  }
  }

  set num(num:number){
    this._num=num;
  }

  get num(){
return this._num;
  }
}
