import { Injectable } from '@angular/core';
import { ItemDescriptionComponent } from './item-description/item-description.component';

@Injectable({
  providedIn: 'root'
})
export class TransferService {

  val : any;
  
  search : any;
  constructor() { }
  store(val){
    localStorage.setItem("val",val);
  }
  store1(){
    return localStorage.getItem("val");
  }
  userid(val){
    localStorage.setItem("user",val);
  }
  userid1(){
    return localStorage.getItem("user");
  }
}