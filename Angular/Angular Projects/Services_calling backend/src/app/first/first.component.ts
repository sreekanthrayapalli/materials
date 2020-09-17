import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {

  name:string="";
  constructor(private activatedroute:ActivatedRoute) {
    
   }

   ngOnInit() {
    console.log("lakdf");
     this.activatedroute.queryParams.subscribe(d=>{
      this.name = d.username;
    })
}

}
