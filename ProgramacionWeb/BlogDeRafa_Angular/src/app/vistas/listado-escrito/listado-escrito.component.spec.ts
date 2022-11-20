import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoEscritoComponent } from './listado-escrito.component';

describe('ListadoEscritoComponent', () => {
  let component: ListadoEscritoComponent;
  let fixture: ComponentFixture<ListadoEscritoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListadoEscritoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListadoEscritoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

