import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, DoCheck, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnChanges,OnInit,DoCheck, AfterContentInit,AfterContentChecked, AfterViewInit,AfterViewChecked{

  
  num:any = [];

  @Input()
  a:number;

  @Input()
  u:any;

  constructor() {
    console.log("Constructor..")
   }
  
  ngOnChanges(changes: SimpleChanges): void {
    this.num.push(this.a);
    console.log(changes.a.currentValue+"    "+changes.a.previousValue);
  }

  ngOnInit(): void {
    console.log("this is init method..")
  }

  ngDoCheck(): void {
    console.log("Ng Do Check");
  }

  ngAfterContentInit() {
    console.log("After Content Init");
  }

  ngAfterContentChecked(): void {
    console.log("After Content Checked");
  }

  ngAfterViewInit(){
    console.log("Page is getting loading...")
  }

  ngAfterViewChecked(){
    console.log("User can see the data")
  }

  ngOnDestroy(){
    console.log("Componet class is getting removed...");
  }

}
