import { TestBed } from '@angular/core/testing';

import { AddDeliveryService } from './add-delivery.service';

describe('AddDeliveryService', () => {
  let service: AddDeliveryService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AddDeliveryService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
