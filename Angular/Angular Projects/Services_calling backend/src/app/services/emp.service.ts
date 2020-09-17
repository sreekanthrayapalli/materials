import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { RestService } from './rest.service';

@Injectable({
  providedIn: 'root'
})
export class EmpService {

  constructor(private rest:RestService) { }

  getEmpData(suburl:string):Observable<any>{
    return this.rest.get(suburl);
  }
}
