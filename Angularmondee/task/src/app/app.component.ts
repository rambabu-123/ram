import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray, FormBuilder } from '@angular/forms'
import { Observable, of } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent  {
  title = 'task';
  myid!:any;
  key!:any;
  lskey='formObj';
  Cartoon:any;
  contactForm = new FormGroup({
    empname: new FormControl(''),
    empid: new FormControl(''),
    email: new FormControl(''),
    gender: new FormControl(''),
   skills:new FormControl(''),
    dateofbirth:new FormControl(''),
  });
  skills: Array<any> = [
    { name: 'java', value: 'java' },
    { name: 'angular', value: 'angular' },
    { name: 'react', value: 'react' },
    { name: 'python', value: 'python' },
    { name: 'cad', value: 'database' },
  ];
  constructor(private fb: FormBuilder) {
    this.contactForm = this.fb.group({
      checkArray: this.fb.array([], [Validators.required]),
    });
  }
  onCheckboxChange(e: any) {
    const checkArray: FormArray = this.contactForm.get('checkArray') as FormArray;
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

  onSubmit() {
    console.log(this.contactForm.value);
    let loginObj: any = localStorage.getItem(this.lskey);
    if(loginObj){
      loginObj = JSON.parse(loginObj);
    }else{
      loginObj = {
        users : []
      };
    }
    let isAvailable = false;
    loginObj.users.forEach((element: { empname: string; }) => {
     if(!isAvailable && element.empname.toLowerCase() == this.contactForm.value.empname.toLowerCase()){
        isAvailable = true;
      } 
    });
    if(!isAvailable){
      loginObj.users.push(this.contactForm
        .value);
    }else{
      alert('user alereay exists');
    };
    localStorage.setItem("formdata",JSON.stringify(this.contactForm.value));
  localStorage.setItem(this.lskey, JSON.stringify(loginObj));
    }
  }

