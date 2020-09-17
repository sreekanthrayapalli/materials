import { Component, OnInit } from '@angular/core';
import { EmpService } from './services/emp.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'routingapp';
  constructor(private empSer:EmpService){
    
  }

  emps:any = [];
  ngOnInit(): void {
    this.empSer.getEmpData("/getemps").subscribe(data=>{
      this.emps = data;
    })
  }
}
