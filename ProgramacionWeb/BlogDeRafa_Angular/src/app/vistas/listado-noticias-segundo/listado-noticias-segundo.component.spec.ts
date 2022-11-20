import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoNoticiasSegundoComponent } from './listado-noticias-segundo.component';

describe('ListadoNoticiasSegundoComponent', () => {
  let component: ListadoNoticiasSegundoComponent;
  let fixture: ComponentFixture<ListadoNoticiasSegundoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListadoNoticiasSegundoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListadoNoticiasSegundoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
