import { AfterContentChecked, AfterContentInit, Component, DoCheck, Input, OnChanges, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent implements OnInit,OnChanges,DoCheck,AfterContentInit,AfterContentChecked {

  @Input()
  a:number;

  @Input()
  name:string;

  constructor() { }

  
  ngOnChanges(changes: SimpleChanges): void {
    console.log("change")
  }

  ngOnInit(): void {
    console.log("oninit")
  }

  
  ngDoCheck(): void {
    console.log("do check");
  }

  
  ngAfterContentInit(): void {
    console.log("After Content Init....");
  }

  ngAfterContentChecked(): void {
    console.log("After content checked..");
  }

  ngAfterViewInit(){
    console.log("After view Init");
  }

  ngAfterViewChecked(){
    console.log("After view checked..");
  }
}
