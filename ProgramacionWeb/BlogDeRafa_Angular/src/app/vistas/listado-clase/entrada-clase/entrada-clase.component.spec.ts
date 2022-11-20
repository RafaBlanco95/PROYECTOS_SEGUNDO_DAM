import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EntradaClaseComponent } from './entrada-clase.component';

describe('EntradaClaseComponent', () => {
  let component: EntradaClaseComponent;
  let fixture: ComponentFixture<EntradaClaseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EntradaClaseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(EntradaClaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

