import { TestBed } from '@angular/core/testing';

import { AddOrdService } from './add-ord.service';

describe('AddOrdService', () => {
  let service: AddOrdService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddOrdService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
