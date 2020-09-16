import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  data:any;
  username:string;
  constructor(private activateRoute:ActivatedRoute) {
    this.activateRoute.queryParams.subscribe(d=>{
      this.username = d.username;
      this.data = d;
    })
  }

  ngOnInit(): void {
  }

}
