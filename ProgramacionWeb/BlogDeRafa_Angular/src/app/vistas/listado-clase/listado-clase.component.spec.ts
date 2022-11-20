import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoClaseComponent } from './listado-clase.component';

describe('ListadoClaseComponent', () => {
  let component: ListadoClaseComponent;
  let fixture: ComponentFixture<ListadoClaseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListadoClaseComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListadoClaseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
