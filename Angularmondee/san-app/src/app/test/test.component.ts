import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
template:`
<h2>
Hello {{name}} 
</h2>
  <button (click)= "onClick()">Greet</button>
  `
 
// styleUrls: ['./test.component.css'],
styles:[`

{
  color:red;
}
`]
})
export class TestComponent implements OnInit {
public name='ram';
public msg=" ";
public msg1=" ";
  constructor() { }

  ngOnInit(): void {
    
    
  }
  onClick(){
    console.log('welcome to ram')
  }
}

