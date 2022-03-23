import { Component, OnInit } from '@angular/core';
import { EmpservicesService } from '../empservices.service';

@Component({
  selector: 'app-emplist',
  templateUrl: './emplist.component.html',
  styleUrls: ['./emplist.component.css']
})
export class EmplistComponent implements OnInit {
public employee:any=[];
  constructor(private _empservices :EmpservicesService) { }

  ngOnInit(): void {
    this.employee=this._empservices.Employee();
  }

}
