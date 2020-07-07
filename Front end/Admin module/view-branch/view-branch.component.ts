import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { BranchPayload } from '../add-branch/branch-payload';
import { AddBranchService } from '../add-branch.service';

@Component({
  selector: 'app-view-branch',
  templateUrl: './view-branch.component.html',
  styleUrls: ['./view-branch.component.css']
})
export class ViewBranchComponent implements OnInit {

  branchs:Observable<Array<BranchPayload>>

  constructor(private addbranchService:AddBranchService) { }

  ngOnInit(): void {
    this.branchs = this.addbranchService.getAllBranch();
  }

}
