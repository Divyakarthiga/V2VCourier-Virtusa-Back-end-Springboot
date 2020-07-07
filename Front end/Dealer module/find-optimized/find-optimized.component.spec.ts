import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FindOptimizedComponent } from './find-optimized.component';

describe('FindOptimizedComponent', () => {
  let component: FindOptimizedComponent;
  let fixture: ComponentFixture<FindOptimizedComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FindOptimizedComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FindOptimizedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
