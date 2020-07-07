import { TestBed } from '@angular/core/testing';

import { AddDispatchService } from './add-dispatch.service';

describe('AddDispatchService', () => {
  let service: AddDispatchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddDispatchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
