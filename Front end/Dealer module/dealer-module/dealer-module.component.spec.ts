import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DealerModuleComponent } from './dealer-module.component';

describe('DealerModuleComponent', () => {
  let component: DealerModuleComponent;
  let fixture: ComponentFixture<DealerModuleComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DealerModuleComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DealerModuleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
