import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';


import { AppComponent } from './app.component';
import { EditorComponent } from './editor/editor.component';

import {EditorService} from './services/editor.service';
import {HttpModule} from '@angular/http';
import { NavbatComponent } from './navbat.component';

@NgModule({
  declarations: [
    AppComponent,
    EditorComponent,
    NavbatComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [
  EditorService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
