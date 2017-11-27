import {Injectable} from '@angular/core';
import {Etiqueta} from '../models/etiqueta';
import {Headers, RequestOptions, Http, Response} from '@angular/http';
import 'rxjs/Rx';
import {Observable} from 'rxjs/Rx';

@Injectable()
export class EditorService {

    private options;
    private url = "http://localhost:5001/api/language/etiqueta";

    constructor(private http: Http) {
        let headers = new Headers({
            'Content-type': 'application/json',
        });
        this.options = new RequestOptions({
            headers: headers
        })
    }

    enviarCodigo(etiqueta: any) {
        let url = this.url;
        let mensaje = etiqueta;
        let iJSON = JSON.stringify({
            "mensaje": mensaje
        });
        return this.http.post(url, iJSON, this.options)
            .map((response: Response) => response.json())
            .catch((error: any) => Observable.throw(error.json().error || {message: "error en el servidor"}));
    }
}
