import { Component } from '@angular/core';
import { FormGroup,FormControl, FormBuilder, FormArray, Validators } from '@angular/forms';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'demo';
  myid!:any;
  myform!:any;
  users!:any;
  lsKey = 'formObj';
  seconds!:any;
  ngOnInit(){
    this.myform= new FormGroup({
      empid : new FormControl(''),
      empname: new FormControl(' '),
      skills: new FormControl(' '),
     gender: new FormControl(' ') ,
     dateofbirth:new FormControl(' ') 
    });
    
    localStorage.setItem("id","100"); 
  }
  skills: Array<any> = [
    { name: 'java', value: 'java' },
    { name: 'angular', value: 'angular' },
    { name: 'react', value: 'react' },
    { name: 'python', value: 'python' },
    { name: 'database', value: 'database' },
  ];
  constructor(private fb: FormBuilder) {
    this.myform = this.fb.group({
      checkArray: this.fb.array([], [Validators.required]),
    });
  }
  onCheckboxChange(e: any) {
    const checkArray: FormArray = this.myform.get('checkArray') as FormArray;
    if (e.target.checked) {
      checkArray.push(new FormControl(e.target.value));
    } else {
      let i: number = 0;
      checkArray.controls.forEach((item: any) => {
        if (item.value == e.target.value) {
          checkArray.removeAt(i);
          return;
        }
        i++;
      });
    }
  } 
  onSubmit()
  {
    console.log(this.myform.value);
    let loginObj: any = localStorage.getItem(this.lsKey);
    if(loginObj){
      loginObj = JSON.parse(loginObj);
    }else{
      loginObj = {
        users : []
      };
    }
    let isAvailable = false;
    loginObj.users.forEach((element: { empname: string; }) => {
     if(!isAvailable && element.empname.toLowerCase() == this.myform.value.empname.toLowerCase()){
        isAvailable = true;
      } 
    });
    if(!isAvailable){
      loginObj.users.push(this.myform.value);
    }else{
      alert('user alereay exists');
    }
  ;
    localStorage.setItem(this.lsKey, JSON.stringify(loginObj));
  }
}
    
  
