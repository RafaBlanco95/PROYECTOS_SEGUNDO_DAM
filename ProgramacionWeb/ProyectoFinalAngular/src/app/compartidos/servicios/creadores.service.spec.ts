import { TestBed } from '@angular/core/testing';

import { CreadoresService } from './creadores.service';

describe('CreadoresService', () => {
  let service: CreadoresService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CreadoresService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
