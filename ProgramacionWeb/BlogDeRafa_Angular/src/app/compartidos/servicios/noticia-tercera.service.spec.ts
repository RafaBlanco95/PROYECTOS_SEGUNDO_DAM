import { TestBed } from '@angular/core/testing';

import { NoticiaTerceraService } from './noticia-tercera.service';

describe('NoticiaTerceraService', () => {
  let service: NoticiaTerceraService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NoticiaTerceraService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
