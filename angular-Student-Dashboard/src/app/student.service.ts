import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor(private http: HttpClient) { }

  API = 'http://localhost:9090';

  public registerStudent(studentData: any) {

    return this.http.post(this.API + '/register', studentData);

  }
  public getStudents() {
    return this.http.get(this.API + '/getStudent');
  }

  public deleteStudent(id: string) {
    return this.http.delete(this.API + '/deleteStudent?id=' + id);
  }

  public updateStudent(student: any){
    return this.http.put(this.API + '/updateStudent', student);
  }

}
