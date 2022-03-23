import { Component, OnInit } from '@angular/core';
import { EmpservicesService } from '../empservices.service';

@Component({
  selector: 'app-empdetails',
  templateUrl: './empdetails.component.html',
  styleUrls: ['./empdetails.component.css']
})
export class EmpdetailsComponent implements OnInit {
  public employee:any=[];
  constructor(private _empservices :EmpservicesService) { }
  ngOnInit(): void {
  
  this.employee=this._empservices.Employee();
}
}
