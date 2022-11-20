import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoNoticiasCuartoComponent } from './listado-noticias-cuarto.component';

describe('ListadoNoticiasCuartoComponent', () => {
  let component: ListadoNoticiasCuartoComponent;
  let fixture: ComponentFixture<ListadoNoticiasCuartoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListadoNoticiasCuartoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListadoNoticiasCuartoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
