import { Component, OnInit, Input } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent{
  firstName:string="";
  lastName:string="";
  phoneNumber:string="";
  email:string="";
  password:string="";
  gender:string="";
  city:string="";
  url:string="";
  responseBack:any;
  constructor(private httpRef:HttpClient,private router: Router) { }

  ngOnInit(): void {
  }
 register(){
    this.httpRef.post("http://localhost:8081/register/users",
    {
      "firstName":this.firstName,
      "lastName":this.lastName,
      "phoneNumber":this.phoneNumber,
      "email":this.email,
      "password":this.password,
      "gender":this.gender,
      "city":this.city
    },{
      headers: new HttpHeaders().set('Content-Type', 'application/json'),
      responseType: 'text' 
   }).subscribe((data )=>{
    console.log(data);
    
     if(data == "Success"){
       this.router.navigate(['/otp']);
     }
     else{
       alert("User already exists, please login");
       this.router.navigate(['/signin']);
     }
    }
   
  );
 
  }

  displayMessage(val){
    console.log(val);
    
  }
 
 
}

