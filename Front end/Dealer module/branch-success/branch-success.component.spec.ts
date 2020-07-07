import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BranchSuccessComponent } from './branch-success.component';

describe('BranchSuccessComponent', () => {
  let component: BranchSuccessComponent;
  let fixture: ComponentFixture<BranchSuccessComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BranchSuccessComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BranchSuccessComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
