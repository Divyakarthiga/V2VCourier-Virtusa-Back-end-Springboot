import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Trackstatus1Component } from './trackstatus1.component';

describe('Trackstatus1Component', () => {
  let component: Trackstatus1Component;
  let fixture: ComponentFixture<Trackstatus1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Trackstatus1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Trackstatus1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
