import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login-component',
  templateUrl: './login-component.component.html',
  styleUrls: ['./login-component.component.css']
})
export class LoginComponentComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {


  }



  movieslist=[{id:1,name:"abc",availableseats:[1,2,3,4,5,6,7,8]},
  {id:2,name:"abcd",availableseats:[1,2,3,4,5,6,7,8]},
];


  password= "";
  username= "";
  homepage:boolean = false;
  loginpage:boolean = true;
  bookingPage:boolean = false;

  userLogin() {
    console.log(this.username);
    console.log(this.password);
    if(this.username=="abcd"&&this.password=="abcd"){
      this.loginpage = false;
      this.homepage= true;
    }
 }
availableseats = [];
globalMovie = {id:0,name:'',availableseats:[]};

 selectedMovie(movie:any){
  this.bookingPage = true;
  this.homepage = false;

console.log(movie)
alert("you have selected    "+movie.name);
this.availableseats = movie.availableseats;
this.globalMovie = movie;
 }

 selSeats=[];

 changeSeat(event:any){
  

 }
 selectedSeats(){
let seats =[];
  seats = this.globalMovie.availableseats;


 }

}
