import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmpservicesService {

  constructor() { }
   Employee()
  {
    return[
    {"id":1,"name":"ram","age":23},
    {"id":2,"name":"ramesh","age":25},
    {"id":3,"name":"ramju","age":28},
    {"id":4,"name":"ram","age":29},
    ];
}
}
