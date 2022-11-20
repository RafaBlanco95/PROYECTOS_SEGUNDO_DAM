import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EntradaEscritaComponent } from './entrada-escrita.component';

describe('EntradaEscritaComponent', () => {
  let component: EntradaEscritaComponent;
  let fixture: ComponentFixture<EntradaEscritaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EntradaEscritaComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EntradaEscritaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

