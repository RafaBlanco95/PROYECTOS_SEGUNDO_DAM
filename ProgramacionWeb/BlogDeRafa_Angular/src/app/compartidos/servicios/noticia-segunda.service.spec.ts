import { TestBed } from '@angular/core/testing';

import { NoticiaSegundaService } from './noticia-segunda.service';

describe('NoticiaSegundaService', () => {
  let service: NoticiaSegundaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(NoticiaSegundaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
