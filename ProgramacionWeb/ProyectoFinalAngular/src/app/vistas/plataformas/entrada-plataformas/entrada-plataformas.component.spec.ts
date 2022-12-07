import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EntradaPlataformasComponent } from './entrada-plataformas.component';

describe('EntradaPlataformasComponent', () => {
  let component: EntradaPlataformasComponent;
  let fixture: ComponentFixture<EntradaPlataformasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EntradaPlataformasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EntradaPlataformasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
