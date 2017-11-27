import { Component, OnInit} from '@angular/core';
import {Etiqueta} from '../models/etiqueta';
import {EditorService} from '../services/editor.service';

@Component({
  selector: 'app-editor',
  templateUrl: './editor.component.html',
  styleUrls: ['./editor.component.css']
})

export class EditorComponent implements OnInit {
  private et: Etiqueta;
  private codes:any;
  private output: any;
  constructor(private service: EditorService) { 
    
  }
  
  enviarCodigo(formCode){
      this.output = "";
      let codigo = formCode.codigo;
      this.service.enviarCodigo(codigo)
      .subscribe(
       res => this.output = res.respuesta,
       er => console.log(er),
       () => console.log('todo OK!')
      );
  }
  
  
 reset(formCode) {
    formCode.reset();
}

  ngOnInit() {
  }

}
