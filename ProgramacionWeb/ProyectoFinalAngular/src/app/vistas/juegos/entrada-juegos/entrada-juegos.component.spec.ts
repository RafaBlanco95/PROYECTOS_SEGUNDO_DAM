import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EntradaJuegosComponent } from './entrada-juegos.component';

describe('EntradaJuegosComponent', () => {
  let component: EntradaJuegosComponent;
  let fixture: ComponentFixture<EntradaJuegosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EntradaJuegosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EntradaJuegosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
