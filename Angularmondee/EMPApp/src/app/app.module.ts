import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmplistComponent } from './emplist/emplist.component';
import { EmpdetailsComponent } from './empdetails/empdetails.component';
import { EmpservicesService } from './empservices.service';

@NgModule({
  declarations: [
    AppComponent,
    EmplistComponent,
    EmpdetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [EmpservicesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
