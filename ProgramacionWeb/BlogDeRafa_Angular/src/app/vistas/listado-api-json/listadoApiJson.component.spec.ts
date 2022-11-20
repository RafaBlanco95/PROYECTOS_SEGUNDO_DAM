import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListadoApiJsonComponent } from './listadoApiJson.component';

describe('ListadoApiJsonComponent', () => {
  let component: ListadoApiJsonComponent;
  let fixture: ComponentFixture<ListadoApiJsonComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListadoApiJsonComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListadoApiJsonComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
