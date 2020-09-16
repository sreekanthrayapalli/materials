import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  model: any = {};

  onSubmit() {
    alert('SUCCESS!! :-)\n\n' + this.model.firstname+"   "+this.model.lastname);
    console.log(JSON.stringify(this.model));
  }

}
