import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BranchPayload } from './add-branch/branch-payload';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AddBranchService {

  private url= "http://localhost:8080/api/branch/"

  constructor(private httpClient:HttpClient) { }

  branch(branchPayload:BranchPayload):Observable<any>
  {
    return this.httpClient.post(this.url + "AddBranch",branchPayload);
  }
  getAllBranch():Observable<Array<BranchPayload>>
  {
   return this.httpClient.get<Array<BranchPayload>>("http://localhost:8080/api/branch/showbranch");
  }
}
