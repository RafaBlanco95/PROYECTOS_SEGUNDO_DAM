import { TestBed } from '@angular/core/testing';

import { NoticiaCuartaService } from './noticia-cuarta.service';

describe('NoticiaCuartaService', () => {
  let service: NoticiaCuartaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NoticiaCuartaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
