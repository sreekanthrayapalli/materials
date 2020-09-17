import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class RestService {

  constructor(private http:HttpClient) { 
  }
  url = environment.url;
  get(suburl:string){
    return this.http.get(this.url+suburl);
  }
}
