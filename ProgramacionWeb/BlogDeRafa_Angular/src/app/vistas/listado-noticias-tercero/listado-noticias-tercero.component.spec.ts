import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoNoticiasTerceroComponent } from './listado-noticias-tercero.component';

describe('ListadoNoticiasTerceroComponent', () => {
  let component: ListadoNoticiasTerceroComponent;
  let fixture: ComponentFixture<ListadoNoticiasTerceroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListadoNoticiasTerceroComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListadoNoticiasTerceroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
